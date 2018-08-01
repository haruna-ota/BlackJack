package _01_cardclass;

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

    //toString
    @Override
    public String toString() {
        if (name().equals("ACE") || name().equals("JACK") || name().equals("QUEEN") || name().equals("KING")) {
            return name();      //name()はEnumの名前を返す
        } else {
            return String.valueOf(rank);
        }
    }
}
