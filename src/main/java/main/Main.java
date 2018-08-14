package main;

import judge.JudgeMan;


public class Main {
    public static void main(String[] args) {
        JudgeMan judgeMan = JudgeMan.create();  //プレイヤー(空)、コンピュータ(空)、山札をコンストラクタにもつ審判を生成

        judgeMan.prepareToStart();  //ゲーム開始の準備をする

        judgeMan.askWhetherToDrawACard();   //プレイヤーとコンピュータに山札からカードを引くかどうか聞く
    }
}
