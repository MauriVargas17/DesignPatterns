package singleton.practice;

public class Bank extends Exchanger{
    private int branches;
    public Bank(String name, String location, double balance, int branches) {
        super(name, location, balance);
        this.branches = branches;
    }

    @Override
    public void exchangeMoney(String currencyFrom, double amount, String currencyTo) {
        System.out.println("Welcome to "+getName()+" with over "+branches+" branches in "+getLocation());
        System.out.println("We can offer you this rate: ");
        super.exchangeMoney(currencyFrom,amount,currencyTo);
        System.out.println();

    }
}
