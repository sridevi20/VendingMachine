package Coin;

public enum CoinType {
    ONEPENCE(0.01),
    TWOPENCE(0.02),
    FIVEPENCE(0.05),
    TENPENCE(0.10),
    TWENTYPENCE(0.20),
    FIFTYPENCE(0.50),
    ONEPOUND(1.00),
    TWOPOUNDS(2.00);


    private  final double coinValue;

    CoinType(double coinValue) {

        this.coinValue = coinValue;
    }
    public double getCoinValue(){

        return this.coinValue;
    }
}

