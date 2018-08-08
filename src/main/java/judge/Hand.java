package judge;

import card_class.Card;

import java.util.List;

public class Hand {
    private List<Card> cards;   //カードのリスト(手札)（プレイヤーのかコンピュータのかはまだ分からない ）

    //コンストラクタ
    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    //カードを手札に追加する
    public void addCardToHand(Card cardToAdd) {
        cards.add(cardToAdd);   //手札にカードを追加する
    }

    //手札を計算するメソッド
    public int calculateTotalPoint() {
        int sum = 0;
        for (Card card : cards) {     //拡張for文
            sum += card.givePointsToTheCard();  //自分に足していく
        }
        return sum;
    }

}
