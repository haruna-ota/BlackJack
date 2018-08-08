package deck_class;

import card_class.Card;
import card_class.CardRankEnum;
import card_class.CardSuitEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {    //山札のクラス
    private List<Card> cards;   //山札

    //コンストラクタ
    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    //toString
    @Override
    public String toString() {
        return cards.toString();
    }

    //52枚のカードを持った山札をつくる
    public static Deck create(){
        List<Card> cardList = new ArrayList<>();    //空のリストを作成
        for (CardSuitEnum suit : CardSuitEnum.values()) {   //全てのマークとランクのカードをリストに入れる
            for (CardRankEnum rank : CardRankEnum.values()) {
                cardList.addAll(Arrays.asList(new Card(suit, rank)));
            }
        }
        return new Deck(cardList);
    }

    //カードの残り枚数を確認
    public int getRemainingCards() {
        return cards.size();
    }

    //山札のカードを1枚取り出す(先頭)
    public Card drawACard() {
        Card result = cards.get(0);//山札の先頭のカードを1枚取り出す
        cards.remove(0);   //山札の先頭のカードを1枚減らす(山札のカードの先頭が更新される)
        return result;
    }
}
