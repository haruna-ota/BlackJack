package judge;

import card_class.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static card_class.CardRankEnum.*;
import static card_class.CardSuitEnum.*;
import static org.junit.Assert.*;

public class HandTest {
    //21点以下の場合
    //テストパターン1(Aのみ:最低点)
    @Test
    public void Hand1() {
        List<Card> cards = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));
        Hand hand = new Hand(cards);

        assertSame(2, hand.calculateTotalPoint());
    }

    //テストパターン2(A混じり)
    @Test
    public void Hand2() {
        List<Card> cards = Arrays.asList(new Card(HEART, ACE), new Card(HEART, TWO));
        Hand hand = new Hand(cards);

        assertSame(3, hand.calculateTotalPoint());
    }

    //テストパターン3(Aなし)
    @Test
    public void Hand3() {
        List<Card> cards = Arrays.asList(new Card(HEART, TWO), new Card(SPADE, TWO));
        Hand hand = new Hand(cards);

        assertSame(4, hand.calculateTotalPoint());
    }

    //テストパターン4(絵札のみ)
    @Test
    public void Hand4() {
        List<Card> cards = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN));
        Hand hand = new Hand(cards);

        assertSame(20, hand.calculateTotalPoint());
    }

    //テストパターン5(絵札混じり)
    @Test
    public void Hand5() {
        List<Card> cards = Arrays.asList(new Card(HEART, JACK), new Card(HEART, TWO));
        Hand hand = new Hand(cards);

        assertSame(12, hand.calculateTotalPoint());
    }

    //テストパターン6(A+絵札のみ)
    @Test
    public void Hand6() {
        List<Card> cards = Arrays.asList(new Card(HEART, ACE), new Card(HEART, JACK));
        Hand hand = new Hand(cards);

        assertSame(11, hand.calculateTotalPoint());
    }

    //テストパターン7(A+絵札のみ:最高点)
    @Test
    public void Hand7() {
        List<Card> cards = Arrays.asList(new Card(HEART, ACE), new Card(HEART, JACK), new Card(HEART, QUEEN));
        Hand hand = new Hand(cards);

        assertSame(21, hand.calculateTotalPoint());
    }

    //テストパターン8(Aなし絵札まじり:最高点)
    @Test
    public void Hand8() {
        List<Card> cards = Arrays.asList(new Card(HEART, TWO), new Card(HEART, NINE), new Card(HEART, JACK));
        Hand hand = new Hand(cards);

        assertSame(21, hand.calculateTotalPoint());
    }

    //テストパターン9(A混じり絵札なし:最高点)
    @Test
    public void Hand9() {
        List<Card> cards = Arrays.asList(new Card(HEART, ACE), new Card(HEART, TEN), new Card(SPADE, TEN));
        Hand hand = new Hand(cards);

        assertSame(21, hand.calculateTotalPoint());
    }

    //テストパターン10(A+絵札なし:最高点)
    @Test
    public void Hand10() {
        List<Card> cards = Arrays.asList(new Card(HEART, TWO), new Card(HEART, NINE), new Card(HEART, TEN));
        Hand hand = new Hand(cards);

        assertSame(21, hand.calculateTotalPoint());
    }

    //テストパターン11(A+絵札まじり)
    @Test
    public void Hand11() {
        List<Card> cards = Arrays.asList(new Card(HEART, ACE), new Card(HEART, TWO), new Card(HEART, JACK));
        Hand hand = new Hand(cards);

        assertSame(13, hand.calculateTotalPoint());
    }

    //22点以上の場合
    //テストパターン12(絵札まじり)
    @Test
    public void Hand12() {
        List<Card> cards = Arrays.asList(new Card(HEART, TEN), new Card(HEART, JACK), new Card(HEART, QUEEN));
        Hand hand = new Hand(cards);

        assertSame(30, hand.calculateTotalPoint());
    }
}
