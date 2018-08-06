package deck_class;

import card_class.Card;

import java.util.List;

public class Deck {    //山札のクラス
    private List<Card> deck;   //山札

    //コンストラクタ
    public Deck(List<Card> deck) {
        this.deck = deck;
    }

    //getter
    public List<Card> getDeck() {
        return deck;
    }

    //カードを1枚取り出す
    public Card drawACard() {
        Card result = deck.get(0);
        return result;
    }
}
