package judge;

import cardclass.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static cardclass.CardRankEnum.*;
import static cardclass.CardSuitEnum.*;
import static org.junit.Assert.*;

public class PlayerTest {
    //2点〜3点の時
    //2枚パターン
    //テストパターン1(Aのみ：最低点)
    @Test
    public void Player1() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(2, player.calculateTotalPoint());
    }

    //テストパターン2(A混じり)
    @Test
    public void Player2() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, ACE), new Card(HEART, TWO));   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(3, player.calculateTotalPoint());
    }

    //テストパターン3(Aなし)
    @Test
    public void Player3() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, TWO), new Card(SPADE, TWO));   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(4, player.calculateTotalPoint());
    }

    //テストパターン4(絵札のみ)
    @Test
    public void Player4() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN));   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(20, player.calculateTotalPoint());
    }

    //テストパターン5(絵混じり)
    @Test
    public void Player5() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, TWO));   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(12, player.calculateTotalPoint());
    }

    //テストパターン6(A+絵札のみ)
    @Test
    public void Player6() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, ACE), new Card(HEART, KING));   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(11, player.calculateTotalPoint());
    }

    //3枚パターン
    //テストパターン7(A+絵札のみ：最高点)
    @Test
    public void Player7() {
        List<Card> handOfP = Arrays.asList(
                new Card(HEART, JACK),
                new Card(HEART, QUEEN),
                new Card(HEART, KING)
        );   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(30, player.calculateTotalPoint());
    }

    //テストパターン8(Aなし+絵札混じり:最高点)
    @Test
    public void Player8() {
        List<Card> handOfP = Arrays.asList(
                new Card(HEART, JACK),
                new Card(HEART, TWO),
                new Card(HEART, NINE)
        );   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(21, player.calculateTotalPoint());
    }

    //テストパターン9(A混じり+絵札なし：最高点)
    @Test
    public void Player9() {
        List<Card> handOfP = Arrays.asList(
                new Card(HEART, ACE),
                new Card(HEART, TEN),
                new Card(SPADE, TEN)
        );   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(21, player.calculateTotalPoint());
    }

    //テストパターン10(A混じり+絵札混じり)
    @Test
    public void Player10() {
        List<Card> handOfP = Arrays.asList(
                new Card(HEART, ACE),
                new Card(HEART, JACK),
                new Card(HEART, TWO)
        );   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(13, player.calculateTotalPoint());
    }

    //テストパターン11(A+絵札なし：最高点)
    @Test
    public void Player11() {
        List<Card> handOfP = Arrays.asList(
                new Card(HEART, TWO),
                new Card(HEART, NINE),
                new Card(HEART, TEN)
        );   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(21, player.calculateTotalPoint());
    }

    //22点以上の時
    //テストパターン12(絵札まじり)
    @Test
    public void Player12() {
        List<Card> handOfP = Arrays.asList(
                new Card(HEART, TEN),
                new Card(HEART, JACK),
                new Card(HEART, QUEEN)
        );   //プレイヤーの手札を生成する（リスト）
        Player player = new Player(handOfP);    //プレイヤーに手札を渡す

        assertSame(30, player.calculateTotalPoint());
    }


}
