package _01_cardclass;

public class Card {
    private CardMarkEnum mark;    //カードのマーク
    private CardNameEnum name;    //カードの絵柄の名前

    //コンストラクタ
    public Card(CardMarkEnum mark, CardNameEnum name) {
        this.mark = mark;
        this.name = name;
    }

    //カードに点数をつける
    public int givePointsToTheCard() {
        int point;
        //カードの絵柄がJackかQueenかKingだった場合は10点
        if (name == CardNameEnum.JACK || name == CardNameEnum.QUEEN || name == CardNameEnum.KING) {
            point = 10;
        } else if (name == CardNameEnum.ACE) {    //カードの絵柄がAだった場合は1点
            point = 1;
        } else {    //それ以外はカードに書かれている数の点数
            point = Integer.valueOf(name.getName());
        }
        return point;
    }
}
