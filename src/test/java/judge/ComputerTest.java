package judge;

import card_class.Card;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static card_class.CardRankEnum.*;
import static card_class.CardSuitEnum.*;
import static org.junit.Assert.*;

public class ComputerTest {
    //山札からカードを引くかどうかのテスト
    //テストパターン1
    // 初期手札が[ハートのA,スペードのA]の場合：手札の合計が2点のため、カードを引く(true)と返ってくればok
    @Test
    public void Computer1() {
        List<Card> handOfC = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));    //コンピュータの手札を生成
        Computer computer = new Computer(new Hand(handOfC));
        assertTrue(computer.isDrawingACard());
    }

    //テストパターン2
    // 初期手札が[スペードの6,クラブの10]の場合：手札の合計が16点のため、カードを引く(true)と返ってくればok
    @Test
    public void Computer2() {
        List<Card> handOfC = Arrays.asList(new Card(SPADE, SIX), new Card(CLUB, TEN));
        Computer computer = new Computer(new Hand(handOfC));
        assertTrue(computer.isDrawingACard());
    }


    //テストパターン3
    // 初期手札が[ハートのクイーン,ダイヤの7]の場合：手札の合計が17点のため、カードを引かない(false)と返ってくればok
    @Test
    public void Computer3() {
        List<Card> handOfC = Arrays.asList(new Card(HEART, QUEEN), new Card(DIAMOND, SEVEN));
        Computer computer = new Computer(new Hand(handOfC));
        assertFalse(computer.isDrawingACard());
    }

    //テストパターン4
    //初期手札が[ハートのA,スペードの10]の場合：手札の合計が11点のため、カードを引く(true)と返ってくればok
    //カードを引いて、手札が[ハートのA,スペードの10,ハートの5]の場合：手札の合計が16点のため、カードを引く(true)と返ってくればok
    @Test
    public void Computer4() {
        List<Card> handOfC = new ArrayList<>(Arrays.asList(new Card(HEART, ACE), new Card(SPADE, TEN)));
        Computer computer = new Computer(new Hand(handOfC));
        assertTrue(computer.isDrawingACard());
        computer.addCards(new Card(HEART, FIVE));   //ハートの5を手札に追加する
        assertTrue(computer.isDrawingACard());
    }

    //テストパターン5
    //初期手札が[ハートのA,スペードの10]の場合：手札の合計が11点のため、カードを引く(true)と返ってくればok
    //カードを引いて、手札が[ハートのA,スペードの10,ハートの6]の場合：手札の合計が17点のため、カードを引かない(false)と返ってくればok
    @Test
    public void Computer5() {
        List<Card> handOfC = new ArrayList<>(Arrays.asList(new Card(HEART, ACE), new Card(SPADE, TEN)));
        Computer computer = new Computer(new Hand(handOfC));
        assertTrue(computer.isDrawingACard());
        computer.addCards(new Card(HEART, SIX));    //ハートの6を手札に追加する
        assertFalse(computer.isDrawingACard());
    }

}
