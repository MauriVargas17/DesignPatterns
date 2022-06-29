package creationalPatterns.singleton.practice;

public class ExchangeHouse extends Exchanger {

    public ExchangeHouse(String name, String location, double balance) {
        super(name, location, balance);
    }

    @Override
    public void exchangeMoney(String currencyFrom, double amount, String currencyTo) {
        System.out.println("Welcome to "+getName()+" exchange house,");
        System.out.println("we can offer you this rate: ");
        super.exchangeMoney(currencyFrom,amount,currencyTo);
        System.out.println();

    }
}

