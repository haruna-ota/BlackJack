package _01_cardclass;

public class Card {
    private CardSuitEnum suit;    //カードのマーク
    private CardRankEnum rank;    //カードの絵柄の名前

    //コンストラクタ
    public Card(CardSuitEnum suit, CardRankEnum rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + "-" + rank;
    }

    //カードに点数をつける
    public int givePointsToTheCard() {
        int point;
        //カードの絵柄がJackかQueenかKingだった場合は10点
        if (rank == CardRankEnum.JACK || rank == CardRankEnum.QUEEN || rank == CardRankEnum.KING) {
            point = 10;
        } else if (rank == CardRankEnum.ACE) {    //カードの絵柄がAだった場合は1点
            point = 1;
        } else {    //それ以外はカードに書かれている数の点数
            point = rank.getRank();
        }
        return point;
    }
}
