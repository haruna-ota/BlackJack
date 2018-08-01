package _01_cardclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private Card card1 = new Card(CardSuitEnum.SPADE, CardRankEnum.ACE);    //スペードのエースのカード
    private Card card2 = new Card(CardSuitEnum.HEART, CardRankEnum.JACK); //ハートのジャックのカード
    private Card card3 = new Card(CardSuitEnum.CLUB, CardRankEnum.QUEEN); //クラブのクイーンのカード
    private Card card4 = new Card(CardSuitEnum.HEART, CardRankEnum.KING); //ハートのキングのカード
    private Card card5 = new Card(CardSuitEnum.DIAMOND, CardRankEnum.FIVE);  //ダイヤの5のカード

    //テスト
    @Test
    public void Card() {
        assertSame(1, card1.givePointsToTheCard());     //エースは1点
        assertSame(10, card2.givePointsToTheCard());    //絵札は10点
        assertSame(10, card3.givePointsToTheCard());    //絵札は10点
        assertSame(10, card4.givePointsToTheCard());    //絵札は10点
        assertSame(5, card5.givePointsToTheCard());     //その他はカードの数字そのままの点
    }
}
