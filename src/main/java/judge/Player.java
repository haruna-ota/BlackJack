package judge;

public class Player {

    private Hand handOfP; //プレイヤーの手札

    //コンストラクタ
    public Player(Hand handOfP) {
        this.handOfP = handOfP;
    }

    //プレイヤーの手札を計算するメソッド
    public int calculateTotalPoint() {
        return handOfP.calculateTotalPoint();
    }
}
