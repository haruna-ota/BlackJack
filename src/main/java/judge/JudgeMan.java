package judge;

import card_class.Card;
import deck_class.Deck;

import java.util.ArrayList;
import java.util.List;

public class JudgeMan {
    private Player player;      //プレイヤー
    private Computer computer;  //コンピュータ
    private Deck deck;          //山札

    //コンストラクタ
    public JudgeMan(Player player, Computer computer, Deck deck) {
        this.player = player;
        this.computer = computer;
        this.deck = deck;

    }

    //手札が空の状態(初期状態)のプレイヤーとコンピュータを持った審判をつくる
    public static JudgeMan create() {
        List<Card> handOfP = new ArrayList<>();     //プレイヤーの手札生成(空)
        List<Card> handOfC = new ArrayList<>();     //コンピュータの手札生成(空)

        Player player = new Player(new Hand(handOfP));
        Computer computer = new Computer(new Hand(handOfC));
        Deck deck = Deck.create();

        return new JudgeMan(player, computer, deck);
    }

    //勝負開始の準備をする
    public void prepareToStart() {
        //山札から1枚ずつ交互に配る(プレイヤー:2枚,コンピュータ:2枚)
        player.addCards(deck.drawACard());      //プレイヤー1枚目
        computer.addCards(deck.drawACard());    //コンピュータ1枚目
        player.addCards(deck.drawACard());      //プレイヤー2枚目
        computer.addCards(deck.drawACard());    //コンピュータ2枚目
    }

    //勝負を開始し、プレイヤーとコンピュータにカードを引くかどうか聞き続ける（引かないと言われるまで）
    public void askWhetherToDrawACard() {
        boolean isPlayerFixed = false;  //プレイヤーの手札は決まりましたか？（これで勝負しますか？）（初期設定では決まっていない:false）
        boolean isComputerFixed = false;//コンピュータの手札は決まりましたか？（これで勝負しますか？）（初期設定では決まっていない:false）

        while (!isPlayerFixed || !isComputerFixed) {   //まだプレイヤーの手札が決まっていない or コンピュータの手札が決まっていない場合
            //コンピュータの現在の手札の枚数を表示し、プレイヤーに引くかどうか聞く
            System.out.println("コンピュータの手札:" + computer.answerTheNumberOfCards() + "枚");
            if (player.calculateTotalPoint() >= 21) {   //プレイヤーの手札が21点以上になったら引くか聞くのをやめる
                System.out.println("===== 手札の合計が21点以上になったため、勝敗判定に移ります =====\n");
                isPlayerFixed = true;  //手札の合計が21点以上になったため手札が決まったことにする
            } else if (!isPlayerFixed && player.isDrawingACard()) {    //まだプレイヤーの手札が決まっていない かつ　カードを引くと言った場合
                player.addCards(deck.drawACard());      //カードを1枚引いて、手札に追加する
            } else {
                isPlayerFixed = true;
            }

            //コンピュータに引くかどうか聞く
            if (player.calculateTotalPoint() >= 22) {
                isComputerFixed = true; //プレイヤーがバーストした時点でコンピュータの手札も決定(カードを引くのをやめる)
            } else if (computer.isDrawingACard()) {
                computer.addCards(deck.drawACard());    //カードを1枚引いて、手札に追加する
            } else {
                isComputerFixed = true;
            }
        }

        //勝敗発表に移る
        System.out.println(decideOnWinningOrLosing());

    }

    //勝敗を決めるメソッド（プレイヤーとコンピュータそれぞれの手札の合計点を比べる）
    public String decideOnWinningOrLosing() {
        //結果発表用表示
        System.out.println("プレイヤーの最終手札:" + player.toString());
        System.out.println("コンピュータの最終手札:" + computer.toString());
        System.out.println("プレイヤーの点数：" + player.calculateTotalPoint() + "点,"
                                   + "コンピュータの点数：" + computer.calculateTotalPoint() + "点");

        if (player.calculateTotalPoint() >= 22) {   //プレイヤーの手札:22点以上→コンピュータの勝ち
            return "コンピュータの勝ちです！";
        } else if (computer.calculateTotalPoint() >= 22) {
            return "プレイヤーの勝ちです！";   //プレイヤーの手札:21点以下かつコンピュータの手札:22点以上→プレイヤーの勝ち
        } else if (player.calculateTotalPoint() == computer.calculateTotalPoint()) { //プレイヤー,コンピュータ手札とも：21点以下かつ同点→引き分け
            return "引き分けです";
        } else if (player.calculateTotalPoint() > computer.calculateTotalPoint()) { //プレイヤーの手札:21点以下かつ >コンピュータの手札→プレイヤーの勝ち
            return "プレイヤーの勝ちです！";
        } else {
            return "コンピュータの勝ちです！";
        }
    }
}
