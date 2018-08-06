package stock_class;

import card_class.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static card_class.CardRankEnum.*;
import static card_class.CardSuitEnum.*;

public class StockTest {
    List<Card> cardList = Arrays.asList(
            new Card(HEART, ACE),
            new Card(HEART, TWO),
            new Card(HEART, THREE),
            new Card(HEART, FOUR),
            new Card(HEART, FIVE),
            new Card(HEART, SIX),
            new Card(HEART, SEVEN),
            new Card(HEART, EIGHT),
            new Card(HEART, NINE),
            new Card(HEART, TEN),
            new Card(HEART, JACK),
            new Card(HEART, QUEEN),
            new Card(HEART, KING),
            new Card(SPADE, ACE),
            new Card(SPADE, TWO),
            new Card(SPADE, THREE),
            new Card(SPADE, FOUR),
            new Card(SPADE, FIVE),
            new Card(SPADE, SIX),
            new Card(SPADE, SEVEN),
            new Card(SPADE, EIGHT),
            new Card(SPADE, NINE),
            new Card(SPADE, TEN),
            new Card(SPADE, JACK),
            new Card(SPADE, QUEEN),
            new Card(SPADE, KING),
            new Card(CLUB, ACE),
            new Card(CLUB, TWO),
            new Card(CLUB, THREE),
            new Card(CLUB, FOUR),
            new Card(CLUB, FIVE),
            new Card(CLUB, SIX),
            new Card(CLUB, SEVEN),
            new Card(CLUB, EIGHT),
            new Card(CLUB, NINE),
            new Card(CLUB, TEN),
            new Card(CLUB, JACK),
            new Card(CLUB, QUEEN),
            new Card(CLUB, KING),
            new Card(DIAMOND, ACE),
            new Card(DIAMOND, TWO),
            new Card(DIAMOND, THREE),
            new Card(DIAMOND, FOUR),
            new Card(DIAMOND, FIVE),
            new Card(DIAMOND, SIX),
            new Card(DIAMOND, SEVEN),
            new Card(DIAMOND, EIGHT),
            new Card(DIAMOND, NINE),
            new Card(DIAMOND, TEN),
            new Card(DIAMOND, JACK),
            new Card(DIAMOND, QUEEN),
            new Card(DIAMOND, KING)
    );
    Stock stock = new Stock(cardList);  //山札を生成

    //テスト
    @Test
    public void Stock() {
        System.out.println(stock.getStock());   //シャッフル前
        stock.shuffleCards();
        System.out.println(stock.getStock());   //シャッフル後
        System.out.println(stock.drawACard());  //山札の先頭から2枚カードを取り出す
    }
}