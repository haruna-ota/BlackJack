package judge;

import cardclass.Card;

import java.util.List;

public class Player {

    private List<Card> handOfP; //プレイヤーの手札

    //コンストラクタ
    public Player(List<Card> handOfP) {
        this.handOfP = handOfP;
    }

    //プレイヤーの手札を計算するメソッド
    public int calculateTotalPoint() {
        int resultOfP = 0;
        for (int i = 0; i < handOfP.size(); i++) {
            resultOfP = resultOfP + handOfP.get(i).givePointsToTheCard();
        }
        return resultOfP;
    }
}
