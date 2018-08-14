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
    public boolean isDrawingACard() {
        return false;  //今回は必ず引かないと答える
    }

}
