package judge;

public class JudgeMan {
    private Player player;      //プレイヤー
    private Computer computer;  //コンピュータ

    //コンストラクタ
    public JudgeMan(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }


    //勝敗を決めるメソッド（プレイヤーとコンピュータそれぞれの手札の合計点を比べる）
    public String decideOnWinningOrLosing() {
        if (player.calculateTotalPoint() > computer.calculateTotalPoint()) {
            return "プレイヤーの勝ちです！";
        } else if (player.calculateTotalPoint() < computer.calculateTotalPoint()) {
            return "コンピュータの勝ちです！";
        } else {
            return "引き分けです";
        }
    }

}
