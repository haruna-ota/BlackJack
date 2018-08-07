package deck_class;

import card_class.Card;
import card_class.CardRankEnum;
import card_class.CardSuitEnum;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DeckTest {
    //テスト
    @Test
    public void Deck() {
        List<Card> cardList = new ArrayList<>();    //空のリストを作成
        for (CardSuitEnum suit : CardSuitEnum.values()) {   //全てのマークとランクのカードをリストに入れる
            for (CardRankEnum rank : CardRankEnum.values()) {
                cardList.addAll(Arrays.asList(new Card(suit, rank)));
            }
        }

        Deck deck = new Deck(cardList);  //山札を生成

        //山札のカードの枚数を確認(52枚あればok)
        assertSame(52, deck.getRemainingCards());

        //山札のカードの1枚目を引く(HEART-ACE)
        assertEquals("HEART-ACE", deck.drawACard().toString());

        //山札のカードの2枚目を引く(HEART-2)
        assertEquals("HEART-2", deck.drawACard().toString());

        //山札のカードの枚数を確認(50枚あればok)
        assertSame(50, deck.getRemainingCards());

    }
}
