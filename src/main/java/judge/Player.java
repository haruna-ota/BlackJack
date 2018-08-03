package judge;

import card_class.Card;

import java.util.List;

public class Player implements Players {

    private List<Card> handOfP; //プレイヤーの手札

    //コンストラクタ
    public Player(List<Card> handOfP) {
        this.handOfP = handOfP;
    }

    //プレイヤーの手札を計算するメソッド
    @Override
    public int calculateTotalPoint() {
        int resultOfP = 0;
        for (Card aHandOfP : handOfP) {     //拡張for文
            resultOfP = resultOfP + aHandOfP.givePointsToTheCard();
        }
        return resultOfP;
    }
}
