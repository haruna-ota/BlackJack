package cardclass;

import java.util.Arrays;

public enum CardRankEnum {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int rank;

    //コンストラクタ
    private CardRankEnum(int rank) {
        this.rank = rank;
    }

    //getter
    public int getRank() {
        return rank;
    }

    public boolean isFaceCard() {   //絵札かどうか調べるメソッド
        return Arrays.asList(JACK, QUEEN, KING).contains(this);     //自分(this)が絵札かどうか聞いている
        // return this == JACK || this == QUEEN || this == KING;
    }

    public boolean isAce() {    //エースかどうか調べるメソッド
        return this == ACE;     //自分(this)がエースかどうか聞いている
    }

    //toString
    @Override
    public String toString() {
        return isAce() || isFaceCard() ? name() : String.valueOf(rank);
    }
}
