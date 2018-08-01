package _01_cardclass;

public enum CardNameEnum {
    ACE("A"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    private String name;

    //コンストラクタ
    private CardNameEnum(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }
}
