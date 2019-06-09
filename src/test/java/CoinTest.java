import Coin.Coin;
import Coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {
    private Coin coin;
   private CoinType coinType;

    @Before
    public void setUp()  {
        coin = new Coin(CoinType.FIFTYPENCE);
    }
    @Test
    public void canGetCoinValue() {
        assertEquals(0.50, coin.getCoinValueType(),0.00);
    }

}
