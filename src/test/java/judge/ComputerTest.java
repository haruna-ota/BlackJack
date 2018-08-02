package judge;

import cardclass.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static cardclass.CardRankEnum.*;
import static cardclass.CardSuitEnum.*;
import static org.junit.Assert.*;

public class ComputerTest {
    //2点〜3点の時
    //2枚パターン
    //テストパターン1(絵札混じり：最低点)
    @Test
    public void Computer1() {
        List<Card> handOfC = Arrays.asList(new Card(HEART, SEVEN), new Card(HEART, JACK));   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(17, computer.calculateTotalPoint());
    }

    //テストパターン2(A+絵札なし：最低点)
    @Test
    public void Computer2() {
        List<Card> handOfC = Arrays.asList(new Card(HEART, SEVEN), new Card(HEART, TEN));   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(17, computer.calculateTotalPoint());
    }

    //テストパターン3(絵札のみ)
    @Test
    public void Computer3() {
        List<Card> handOfC = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN));   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(20, computer.calculateTotalPoint());
    }

    //3枚パターン
    //テストパターン4(A混じり：最低点)
    @Test
    public void Computer4() {
        List<Card> handOfC = Arrays.asList(
                new Card(HEART, ACE),
                new Card(HEART, SIX),
                new Card(HEART, TEN)
        );   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(17, computer.calculateTotalPoint());
    }

    //テストパターン5(絵札混じり：最低点)
    @Test
    public void Computer5() {
        List<Card> handOfC = Arrays.asList(
                new Card(HEART, TWO),
                new Card(HEART, FIVE),
                new Card(HEART, JACK)
        );   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(17, computer.calculateTotalPoint());
    }

    //テストパターン6(A+絵札なし：最低点)
    @Test
    public void Computer6() {
        List<Card> handOfC = Arrays.asList(
                new Card(HEART, TWO),
                new Card(HEART, FIVE),
                new Card(HEART, TEN)
        );   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(17, computer.calculateTotalPoint());
    }

    //テストパターン7(A+絵札混じり：最低点)
    @Test
    public void Computer7() {
        List<Card> handOfC = Arrays.asList(
                new Card(HEART, ACE),
                new Card(HEART, SIX),
                new Card(HEART, JACK)
        );   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(17, computer.calculateTotalPoint());
    }

    //22点以上の時
    //テストパターン8(絵札混じり)
    @Test
    public void Computer8() {
        List<Card> handOfC = Arrays.asList(
                new Card(HEART, TEN),
                new Card(HEART, JACK),
                new Card(HEART, QUEEN)
        );   //コンピュータの手札を生成する（リスト）
        Computer computer = new Computer(handOfC);    //コンピュータに手札を渡す

        assertSame(30, computer.calculateTotalPoint());
    }


}
