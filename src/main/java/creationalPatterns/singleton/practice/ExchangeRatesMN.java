package creationalPatterns.singleton.practice;

public class ExchangeRatesMN {
    private static final ExchangeRatesMN manager = new ExchangeRatesMN();
    private double[][] rates = {{1,0.1,0.142857},{9,1,1},{7,1,1}};

    public static ExchangeRatesMN getExchangeRatesMN(){
        return manager;
    }

    public double getRate(String currencyFrom, double amount, String currencyTo){
        int row, column;
        row = obtainCurrencyCoordinate(currencyFrom);
        column = obtainCurrencyCoordinate(currencyTo);
        return amount*rates[row][column];
    }

    public int obtainCurrencyCoordinate(String currency){
        int coordinate;
        switch (currency){
            case "BOB": coordinate = 0; break;
            case "EUR": coordinate = 1; break;
            case "SUS": coordinate = 2; break;
            default: throw new IllegalArgumentException("Invalid currency");
        }
        return coordinate;
    }
}
