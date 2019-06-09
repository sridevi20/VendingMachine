import Coin.Coin;
import Coin.CoinType;
import org.junit.Before;
import org.junit.Test;
import Coin.CoinReturn;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {
    private CoinReturn coinReturn;
    private ArrayList<Coin> coins;
    private Coin coin;
    private Coin coin1;
    private Coin coin2;
    private Coin coin3;
    private Coin coin4;
    private Coin coin5;
    private Coin coin6;
    private Coin coin7;

    @Before
    public void setUp() {
        coinReturn = new CoinReturn();
        coins = new ArrayList<Coin>();
        coin = new Coin(CoinType.ONEPENCE);
        coin1 = new Coin(CoinType.TWOPENCE);
        coin2 = new Coin(CoinType.FIVEPENCE);
        coin3 = new Coin(CoinType.TENPENCE);
        coin4 = new Coin(CoinType.TWENTYPENCE);
        coin5 = new Coin(CoinType.FIFTYPENCE);
        coin6 = new Coin(CoinType.ONEPOUND);
        coin7 = new Coin(CoinType.TWOPOUNDS);
    }

    @Test
    public void canAddCoin() {
        coinReturn.addCoinToCoinReturn(coin);
        assertEquals(1, coinReturn.countCoin());

    }

    @Test
    public void CoinTotalAmount() {
        coinReturn.addCoinToCoinReturn(coin);
        coinReturn.addCoinToCoinReturn(coin1);
        coinReturn.addCoinToCoinReturn(coin2);
        coinReturn.addCoinToCoinReturn(coin3);
        coinReturn.addCoinToCoinReturn(coin4);
        coinReturn.addCoinToCoinReturn(coin5);
        coinReturn.addCoinToCoinReturn(coin6);
        coinReturn.addCoinToCoinReturn(coin7);
        assertEquals(3.88,coinReturn.getCoinTotalAmount(coin),0.00);



    }
}


