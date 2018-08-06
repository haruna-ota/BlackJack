package card_class;

public class Card {
    private CardSuitEnum suit;    //カードのマーク
    private CardRankEnum rank;    //カードの絵柄の名前

    //コンストラクタ
    public Card(CardSuitEnum suit, CardRankEnum rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //toString
    @Override
    public String toString() {
        return suit.toString() + "-" + rank.toString();     //suitはObjectの、rankは自分で書いたCardRankEnumのtoStoringに飛ぶ
    }

    //カードに点数をつける
    public int givePointsToTheCard() {
        int point;
        //カードの絵柄がJackかQueenかKingだった場合は10点
        if (rank.isFaceCard()) {
            point = 10;
        } else if (rank.isAce()) {    //カードの絵柄がAだった場合は1点
            point = 1;
        } else {    //それ以外はカードに書かれている数の点数
            point = rank.getRank();
        }
        return point;
    }
}
