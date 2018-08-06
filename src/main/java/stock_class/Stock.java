package stock_class;

import card_class.Card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stock {    //山札のクラス
    private List<Card> stock;   //山札

    //コンストラクタ
    public Stock(List<Card> stock) {
        this.stock = stock;
    }

    //getter
    public List<Card> getStock() {
        return stock;
    }


    //山札のカードをシャッフル
    public void shuffleCards() {
        Collections.shuffle(stock);
    }


    //カードを2枚取り出す
    public List<Card> drawACard() {
        List<Card> result = Arrays.asList(stock.get(0), stock.get(1));
        return result;
    }
}
