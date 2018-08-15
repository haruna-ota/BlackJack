package judge;

import card_class.Card;

import java.util.Scanner;


public class Player {
    private Hand handOfP; //プレイヤーの手札

    //コンストラクタ
    public Player(Hand handOfP) {
        this.handOfP = handOfP;
    }

    //審判からカードをもらう
    public void addCards(Card cardOfP) {
        handOfP.add(cardOfP);   //審判からもらったカード(1枚)を、手札に追加する
    }

    //プレイヤーの手札を計算するメソッド
    public int calculateTotalPoint() {
        return handOfP.calculateTotalPoint();
    }

    //山札からカードを引くかどうか答える
    public boolean isDrawingACard() {
        System.out.println("プレイヤー現在の手札:" + handOfP.toString());
        System.out.println("山札からカードを1枚引きますか？（y or nを入力して下さい）");

        Scanner sc = new Scanner(System.in);

        while (true) {  //正しい入力が来るまでループする
            String answerOfP = sc.next();   //プレイヤーが引く:yか、引かないか:nを標準入力で答える
            if (answerOfP.equals("y")) {
                return true;
            } else if (answerOfP.equals("n")) {
                return false;
            } else {
                System.out.println("正しく入力して下さい（y or n）");
            }
        }
    }

}
