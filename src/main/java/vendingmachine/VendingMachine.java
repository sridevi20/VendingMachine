package vendingmachine;

import Coin.Coin;
import Drawer.Drawer;
import Coin.CoinReturn;
import Coin.CoinType;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Coin>coins;
    private ArrayList<Drawer>drawers;
    private CoinReturn coinReturn;
    private Coin coin;


    public VendingMachine() {
        this.coins = new ArrayList<Coin>();
        this.drawers = new ArrayList<Drawer>();
        this.coinReturn = new CoinReturn();


    }

    public ArrayList<Coin> getCoin()
    {

        return this.coins;
    }

    public ArrayList<Drawer> getDrawer()
    {
        return drawers;
    }
    public void addCoin(Coin coin){

        this.coins.add(coin);
    }

    public int countCoin(){

        return  this.coins.size();
    }

    public boolean checkValidCoin(Coin coin){
        if(coin.getCoinValueType()< 0.05){
            return false;
        }else
            return true;
    }
    public boolean  AddValidValueToMachineOrAddToCOinReturn(Coin coin ) {
        if (coin.getCoinValueType()> 0.05) {
            return this.coins.add(coin);
        } else
            return this.coinReturn.addCoinToCoinReturn( coin);

        }


//    public String buyProductWithCode(Drawer drawer) {
//        if(drawer.getProductCode()){
//            return this.getProductCode();
//        }
//    }
}
