package judge;

public class Computer {
    private Hand handOfC; //コンピュータの手札

    //コンストラクタ
    public Computer(Hand handOfC) {
        this.handOfC = handOfC;
    }

    //コンピュータの手札を計算するメソッド
    public int calculateTotalPoint() {
        return handOfC.calculateTotalPoint();
    }
}
