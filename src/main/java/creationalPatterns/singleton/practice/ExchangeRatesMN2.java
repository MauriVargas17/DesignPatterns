package creationalPatterns.singleton.practice;

public class ExchangeRatesMN2 {
    private static final ExchangeRatesMN manager = new ExchangeRatesMN();
    private double[][] rates = {{1,0.1,0.142857},{9,1,1},{7,1,1}};

    public static ExchangeRatesMN getExchangeRatesMN(){
        return manager;
    }

    private int rtnCoordinate(int n){
        n = n - 66;
        return n % (n-1) == 16 ? 2 : n % (n-1);
    }

    public double getRate(String currencyFrom, double amount, String currencyTo){
        int row, column;
        row = currencyFrom.toCharArray()[0];
        column = currencyTo.toCharArray()[0];
        return amount*rates[rtnCoordinate(row)][rtnCoordinate(column)];
    }

}
