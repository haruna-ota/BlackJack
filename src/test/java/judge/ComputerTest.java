package judge;

import card_class.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static card_class.CardRankEnum.*;
import static card_class.CardSuitEnum.*;
import static org.junit.Assert.*;

public class ComputerTest {
    //山札からカードを引くかどうかのテスト
    @Test
    public void Computer() {
        List<Card> handOfC = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));    //コンピュータの手札を生成
        Computer computer = new Computer(new Hand(handOfC));
        assertFalse(computer.isAnswerWhetherToDrawACard());
    }

}
