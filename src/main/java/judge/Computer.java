package judge;

import card_class.Card;


public class Computer {
    private Hand handOfC; //コンピュータの手札

    //コンストラクタ
    public Computer(Hand handOfC) {
        this.handOfC = handOfC;
    }

    //審判からカードをもらう
    public void addCards(Card cardOfC) {
        handOfC.add(cardOfC);   //審判からもらったカード(1枚)を、手札に追加する
    }

    //コンピュータの手札を計算するメソッド
    public int calculateTotalPoint() {
        return handOfC.calculateTotalPoint();
    }

    //山札からカードを引くかどうか答える
    public int answerWhetherToDrawACard() {
        int drawFlagOfC = 1;    //コンピュータのフラグ（0:引く,1:引かない（今回は初めから引かないと言う））
        return drawFlagOfC;
    }
}
