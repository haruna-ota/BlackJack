package judge;

import card_class.Card;
import deck_class.Deck;

import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {   //山札上から偶数番目の枚数の時はプレイヤーに配る
                Card cardOfP = deck.drawACard();    //山札から1枚カードをもらう
                player.addCards(cardOfP);           //手札に追加する
            } else {            //山札上から奇数番目の枚数の時はコンピュータに配る
                Card cardOfC = deck.drawACard();    //山札から1枚カードをもらう
                computer.addCards(cardOfC);         //手札に追加する
            }
        }
    }

    //勝敗を決めるメソッド（プレイヤーとコンピュータそれぞれの手札の合計点を比べる）
    public String decideOnWinningOrLosing() {
        if (player.calculateTotalPoint() > computer.calculateTotalPoint()) {
            return "プレイヤーの勝ちです！";
        } else if (player.calculateTotalPoint() < computer.calculateTotalPoint()) {
            return "コンピュータの勝ちです！";
        } else {
            return "引き分けです";
        }
    }
}
