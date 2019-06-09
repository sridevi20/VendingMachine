package Coin;

import java.util.ArrayList;
import Coin.Coin;
public class CoinReturn {

    private ArrayList<Coin>coins;
    public CoinReturn() {

        this.coins = new ArrayList<Coin>();

    }

    public ArrayList<Coin> getCoin() {
        return coins;
    }

    public void setCoin() {

        this.coins = coins;
    }
    public boolean addCoinToCoinReturn(Coin coin)
    {

       return  this.coins.add(coin);
    }
    public int countCoin(){
        return this.coins.size();
    }

    public double getCoinTotalAmount(Coin coin) {

        double total = 0;
        for (Coin value: coins) {
            total += value.getCoinValueType();
        }
        return total;
    }



    }


