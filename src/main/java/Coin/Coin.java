package Coin;
import Coin.CoinType;

public class Coin {
    private CoinType coinType;

    public Coin(CoinType coinType) {

        this.coinType = coinType;
    }
    public double getCoinValueType(){

        return coinType.getCoinValue();
    }
}
