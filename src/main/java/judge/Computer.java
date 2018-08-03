package judge;

import card_class.Card;

import java.util.List;

public class Computer implements Players {
    private List<Card> handOfC; //コンピュータの手札

    //コンストラクタ
    public Computer(List<Card> handOfC) {
        this.handOfC = handOfC;
    }

    //コンピュータの手札を計算するメソッド
    @Override
    public int calculateTotalPoint() {
        int resultOfC = 0;
        for (Card aHandOfC : handOfC) {     //拡張for文
            resultOfC = resultOfC + aHandOfC.givePointsToTheCard();
        }
        return resultOfC;
    }
}
