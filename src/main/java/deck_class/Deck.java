package deck_class;

import card_class.Card;

import java.util.List;

public class Deck {    //山札のクラス
    private List<Card> cards;   //山札
    private int remainingCards; //山札の残りのカードの枚数

    //コンストラクタ
    public Deck(List<Card> cards) {
        this.cards = cards;
        this.remainingCards = cards.size(); //山札のカードの枚数(初期値:52枚)
    }

    //toString
    @Override
    public String toString() {
        return cards.toString();
    }

    //カードの残り枚数を確認
    public int getRemainingCards() {
        return remainingCards;
    }

    //カードを1枚取り出す
    public Card drawACard() {
        Card result = cards.get(cards.size() - remainingCards);     //52枚から山札の残りのカード枚数を引いたものが○枚目
        remainingCards--;   //1枚引いたら、山札の残りのカードの枚数を1枚減らす
        return result;
    }
}
