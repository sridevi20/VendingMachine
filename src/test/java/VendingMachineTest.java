import Coin.Coin;
import Coin.CoinReturn;
import Drawer.Drawer;
import Coin.CoinType;
import Drawer.ProductCodeType;
import org.junit.Before;
import org.junit.Test;
import vendingmachine.VendingMachine;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    private VendingMachine vendingMachine;
    private CoinReturn coinReturn;
    private Coin coin;
    private Drawer drawer;
    @Before
    public void setUp(){
       vendingMachine = new VendingMachine();
       coinReturn = new CoinReturn();
       coin = new Coin(CoinType.TWOPENCE);
       drawer = new Drawer(ProductCodeType.COLA);
    }
    @Test
    public void canAddCoin() {
        coin = new Coin(CoinType.FIFTYPENCE);
        vendingMachine.addCoin(coin);

        assertEquals(1, vendingMachine.countCoin());
    }
    @Test
    public void checkValidCoin(){
        assertEquals(false, vendingMachine.checkValidCoin(coin));
    }

    @Test
    public void canAddValidCoinToMAchineOrAddTOCoinReturn() {
        coin = new Coin(CoinType.TWOPENCE);
        vendingMachine.addCoin(coin);
        coinReturn.addCoinToCoinReturn(coin);
        assertEquals(coinReturn.countCoin(), vendingMachine.AddValidValueToMachineOrAddToCOinReturn(coin));
    }
//        @Test
//        public void canBuyProductWithCode(){
//
//            drawer.getProductCode();
//            assertEquals("C1",vendingMachine.buyProductWithCode());
//        }
//
//}



}
