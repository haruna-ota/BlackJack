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

        while (!isPlayerFixed || computer.isDrawingACard()) {   //まだプレイヤーの手札が決まっていない or コンピュータが引くと言っている場合
            //プレイヤーに引くかどうか聞く
            if (!isPlayerFixed && player.isDrawingACard()) {    //まだプレイヤーの手札が決まっていない かつ　カードを引くと言った場合
                player.addCards(deck.drawACard());      //カードを1枚引いて、手札に追加する
            } else {
                isPlayerFixed = true;
            }

            //コンピュータに引くかどうか聞く
            if (computer.isDrawingACard()) {
                computer.addCards(deck.drawACard());    //カードを1枚引いて、手札に追加する
            }
        }

        //勝敗発表に移る
        System.out.println(decideOnWinningOrLosing());

    }

    //勝敗を決めるメソッド（プレイヤーとコンピュータそれぞれの手札の合計点を比べる）
    public String decideOnWinningOrLosing() {
        System.out.println("プレイヤーの点数：" + player.calculateTotalPoint() + "点," + "コンピュータの点数：" + computer.calculateTotalPoint() + "点");
        if (player.calculateTotalPoint() > computer.calculateTotalPoint()) {
            return "プレイヤーの勝ちです！";
        } else if (player.calculateTotalPoint() < computer.calculateTotalPoint()) {
            return "コンピュータの勝ちです！";
        } else {
            return "引き分けです";
        }
    }
}
