package _01_cardclass;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private Card card1 = new Card(CardMarkEnum.SPADE, CardNameEnum.ACE);    //スペードのエースのカード
    private Card card2 = new Card(CardMarkEnum.HEART, CardNameEnum.JACK); //ハートのジャックのカード
    private Card card3 = new Card(CardMarkEnum.CLUB, CardNameEnum.QUEEN); //クラブのクイーンのカード
    private Card card4 = new Card(CardMarkEnum.HEART, CardNameEnum.KING); //ハートのキングのカード
    private Card card5 = new Card(CardMarkEnum.DIAMOND, CardNameEnum.FIVE);  //ダイヤの5のカード

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
