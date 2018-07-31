package _01_cardclass;

public class Card {
    private String mark;    //カードのマーク
    private String name;    //カードの絵柄の名前

    //コンストラクタ
    public Card(String mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    //カードに点数をつける
    public int givePointsToTheCard() {
        int point;
        //カードの絵柄がJackかQueenかKingだった場合は10点
        if (name.equals("Jack") || name.equals("Queen") || name.equals("King")) {
            point = 10;
        } else if (name.equals("A")) {    //カードの絵柄がAだった場合は1点
            point = 1;
        } else {    //それ以外はカードに書かれている数の点数
            point = Integer.valueOf(name);
        }
        return point;
    }
}
