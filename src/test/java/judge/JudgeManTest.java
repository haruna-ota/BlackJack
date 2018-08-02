package judge;

import cardclass.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static cardclass.CardRankEnum.*;
import static cardclass.CardSuitEnum.*;
import static org.junit.Assert.*;


public class JudgeManTest {
    //テストパターン1：プレイヤーが勝つ場合
    @Test
    public void JudgeMan1() {
        List<Card> handsOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN));
        List<Card> handsOfC = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));

        Player player = new Player(handsOfP);
        Computer computer = new Computer(handsOfC);

        JudgeMan judgeMan = new JudgeMan(new Player(handsOfP), new Computer(handsOfC));
        assertEquals(
                "プレイヤーの勝ちです！",
                judgeMan.decideOnWinningOrLosing(player.calculateTotalPoint(), computer.calculateTotalPoint())
        );
    }

    //テストパターン2：コンピュータが勝つ場合
    @Test
    public void JudgeMan2() {
        List<Card> handsOfP = Arrays.asList(new Card(HEART, ACE), new Card(HEART, FIVE));
        List<Card> handsOfC = Arrays.asList(new Card(HEART, TEN), new Card(SPADE, KING));

        Player player = new Player(handsOfP);
        Computer computer = new Computer(handsOfC);

        JudgeMan judgeMan = new JudgeMan(new Player(handsOfP), new Computer(handsOfC));
        assertEquals(
                "コンピュータの勝ちです！",
                judgeMan.decideOnWinningOrLosing(player.calculateTotalPoint(), computer.calculateTotalPoint())
        );
    }

    //テストパターン3：引き分けの場合
    @Test
    public void JudgeMan3() {
        List<Card> handsOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN));
        List<Card> handsOfC = Arrays.asList(new Card(HEART, TEN), new Card(SPADE, KING));

        Player player = new Player(handsOfP);
        Computer computer = new Computer(handsOfC);

        JudgeMan judgeMan = new JudgeMan(new Player(handsOfP), new Computer(handsOfC));
        assertEquals(
                "引き分けです",
                judgeMan.decideOnWinningOrLosing(player.calculateTotalPoint(), computer.calculateTotalPoint())
        );
    }
}
