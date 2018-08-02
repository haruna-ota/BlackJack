package judge;

import cardclass.Card;

import java.util.List;

public class Computer {
    private List<Card> handOfC; //コンピュータの手札

    //コンストラクタ
    public Computer(List<Card> handOfC) {
        this.handOfC = handOfC;
    }

    //コンピュータの手札を計算するメソッド
    public int calculateTotalPoint() {
        int resultOfC = 0;
        for (int i = 0; i < handOfC.size(); i++) {
            resultOfC = resultOfC + handOfC.get(i).givePointsToTheCard();
        }
        return resultOfC;
    }
}
