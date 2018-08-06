package deck_class;

import card_class.Card;
import card_class.CardRankEnum;
import card_class.CardSuitEnum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DeckTest {
    //テスト
    @Test
    public void Stock() {
        List<Card> cardList = new ArrayList<>();    //空のリストを作成
        for (CardSuitEnum suit : CardSuitEnum.values()) {   //全てのマークとランクのカードをリストに入れる
            for (CardRankEnum rank : CardRankEnum.values()) {
                cardList.addAll(Arrays.asList(new Card(suit, rank)));
            }
        }

        Deck deck = new Deck(cardList);  //山札を生成

        System.out.println(deck.getDeck());     //山札一覧
        System.out.println(deck.drawACard());   //カードを一枚取り出す
    }
}
