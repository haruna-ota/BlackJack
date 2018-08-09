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

        deck.drawACard();   //カードを1枚引く

        //山札のカードの枚数を確認(51枚あればok)
        assertSame(51, deck.getRemainingCards());

    }
}
