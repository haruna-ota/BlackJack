package judge;

import card_class.Card;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static card_class.CardRankEnum.*;
import static card_class.CardSuitEnum.*;
import static org.junit.Assert.*;


public class JudgeManTest {
    //テストパターン1：プレイヤーが勝つ場合
    @Test
    public void JudgeMan1() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN)); //プレイヤーの手札を生成
        List<Card> handOfC = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));    //コンピュータの手札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)));
        assertEquals(
                "プレイヤーの勝ちです！",
                judgeMan.decideOnWinningOrLosing()
        );
    }

    //テストパターン2：コンピュータが勝つ場合
    @Test
    public void JudgeMan2() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, ACE), new Card(HEART, FIVE));   //プレイヤーの手札を生成
        List<Card> handOfC = Arrays.asList(new Card(HEART, TEN), new Card(SPADE, KING));   //コンピュータの手札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)));
        assertEquals(
                "コンピュータの勝ちです！",
                judgeMan.decideOnWinningOrLosing()
        );
    }

    //テストパターン3：引き分けの場合
    @Test
    public void JudgeMan3() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN)); //プレイヤーの手札を生成
        List<Card> handOfC = Arrays.asList(new Card(HEART, TEN), new Card(SPADE, KING));   //コンピュータの手札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)));
        assertEquals(
                "引き分けです",
                judgeMan.decideOnWinningOrLosing()
        );
    }
}
