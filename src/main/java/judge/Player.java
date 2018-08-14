package judge;

import card_class.Card;


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
    public int answerWhetherToDrawACard(){
        int drawFlagOfP = 1;    //プレイヤーのフラグ（0:引く,1:引かない（今回は初めから引かないと言う））
        return drawFlagOfP;
    }

}
