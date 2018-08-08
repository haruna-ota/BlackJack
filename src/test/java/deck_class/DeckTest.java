package deck_class;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    //テスト
    @Test
    public void Deck() {
        Deck deck = Deck.create();  //52枚のカードを持った山札をくださーい

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
