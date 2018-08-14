package main;

import judge.JudgeMan;


public class Main {
    public static void main(String[] args) {
        JudgeMan judgeMan = JudgeMan.create();  //プレイヤー(空)、コンピュータ(空)、山札をコンストラクタにもつ審判を生成

        judgeMan.prepareToStart();  //ゲーム開始の準備をする

        judgeMan.askWhetherToDrawACard();   //勝負を開始し、プレイヤーとコンピュータにカードを引くかどうか聞き続ける（引かないと言われるまで）
    }
}
