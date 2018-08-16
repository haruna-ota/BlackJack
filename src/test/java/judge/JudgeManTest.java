package judge;

import card_class.Card;
import deck_class.Deck;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static card_class.CardRankEnum.*;
import static card_class.CardSuitEnum.*;
import static org.junit.Assert.*;


public class JudgeManTest {
    //両者ともバースト(22点以上)していない場合
    //テストパターン1：プレイヤーが勝つ場合
    @Test
    public void JudgeMan1() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN)); //プレイヤーの手札を生成
        List<Card> handOfC = Arrays.asList(new Card(HEART, ACE), new Card(SPADE, ACE));    //コンピュータの手札を生成
        Deck deck = Deck.create();  //山札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)), deck);
        assertEquals("プレイヤーの勝ちです！", judgeMan.decideOnWinningOrLosing());
    }

    //テストパターン2：コンピュータが勝つ場合
    @Test
    public void JudgeMan2() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, ACE), new Card(HEART, FIVE));   //プレイヤーの手札を生成
        List<Card> handOfC = Arrays.asList(new Card(HEART, TEN), new Card(SPADE, KING));   //コンピュータの手札を生成
        Deck deck = Deck.create();  //山札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)), deck);
        assertEquals("コンピュータの勝ちです！", judgeMan.decideOnWinningOrLosing());
    }

    //テストパターン3：引き分けの場合
    @Test
    public void JudgeMan3() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, JACK), new Card(HEART, QUEEN)); //プレイヤーの手札を生成
        List<Card> handOfC = Arrays.asList(new Card(HEART, TEN), new Card(SPADE, KING));   //コンピュータの手札を生成
        Deck deck = Deck.create();  //山札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)), deck);
        assertEquals("引き分けです", judgeMan.decideOnWinningOrLosing());
    }

    //両者またはどちらかがバースト(22点以上)している場合
    //テストパターン4：両者バースト(22点以上)でコンピュータが勝つ場合
    @Test
    public void JudgeMan4() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, TWO), new Card(HEART, QUEEN), new Card(HEART, KING));
        List<Card> handOfC = Arrays.asList(new Card(SPADE, TWO), new Card(SPADE, QUEEN), new Card(SPADE, KING));
        Deck deck = Deck.create();  //山札を生成

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)), deck);
        assertEquals("コンピュータの勝ちです！", judgeMan.decideOnWinningOrLosing());
    }

    //テストパターン5：コンピュータのみバースト(22点以上)でプレイヤーが勝つ場合
    @Test
    public void JudgeMan5() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, QUEEN), new Card(HEART, KING), new Card(HEART, ACE));
        List<Card> handOfC = Arrays.asList(new Card(SPADE, TWO), new Card(SPADE, QUEEN), new Card(SPADE, KING));
        Deck deck = Deck.create();

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)), deck);
        assertEquals("プレイヤーの勝ちです！", judgeMan.decideOnWinningOrLosing());

    }

    //テストパターン6：プレイヤーのみバースト(22点以上)でコンピュータが勝つ場合
    @Test
    public void JudgeMan6() {
        List<Card> handOfP = Arrays.asList(new Card(HEART, QUEEN), new Card(HEART, KING), new Card(HEART, TWO));
        List<Card> handOfC = Arrays.asList(new Card(SPADE, QUEEN), new Card(SPADE, SEVEN));
        Deck deck = Deck.create();

        JudgeMan judgeMan = new JudgeMan(new Player(new Hand(handOfP)), new Computer(new Hand(handOfC)), deck);
        assertEquals("コンピュータの勝ちです！", judgeMan.decideOnWinningOrLosing());

    }


}
