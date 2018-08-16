package judge;

import card_class.Card;


public class Computer {
    private Hand handOfC; //コンピュータの手札

    //コンストラクタ
    public Computer(Hand handOfC) {
        this.handOfC = handOfC;
    }

    //toString  コンピュータの手札表示用
    @Override
    public String toString() {
        return handOfC.toString();
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
    public boolean isDrawingACard() {
        //コンピュータの手札の合計が現在16点以下の場合は必ず引くと答える(trueを返す)
        return calculateTotalPoint() <= 16;
    }

    //現在の手札の枚数を答える
    public int answerTheNumberOfCards() {
        return handOfC.answerTheNumberOfCards();
    }
}
