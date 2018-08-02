package judge;

public class JudgeMan {
    private Player player;
    private Computer computer;

    public JudgeMan(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }


    //勝敗を決めるメソッド
    public String decideOnWinningOrLosing(int resultOfP, int resultOfC) {
        if (resultOfP > resultOfC) {
            return "プレイヤーの勝ちです！";
        } else if (resultOfP < resultOfC) {
            return "コンピュータの勝ちです！";
        } else {
            return "引き分けです";
        }
    }

}
