package singleton.practice;

public abstract class Exchanger {
    private String name;
    private String location;
    private double balance;

    public Exchanger(String name, String location, double balance) {
        this.name = name;
        this.location = location;
        this.balance = balance;
    }

    public void exchangeMoney(String currencyFrom, double amount, String currencyTo){
        double exrate = ExchangeRatesMN.getExchangeRatesMN().getRate(currencyFrom,amount,currencyTo);
        System.out.println(amount+" "+currencyFrom+" for "+exrate+" "+currencyTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
