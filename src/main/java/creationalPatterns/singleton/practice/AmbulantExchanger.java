package singleton.practice;

public class AmbulantExchanger extends Exchanger {
    private boolean hasGun;
    public AmbulantExchanger(String name, String location, double balance, boolean hasGun) {
        super(name, location, balance);
        this.hasGun = hasGun;
    }

    public boolean isHasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
    }

    @Override
    public void exchangeMoney(String currencyFrom, double amount, String currencyTo){
        System.out.println("Hey there, I can offer you this rate: ");
        super.exchangeMoney(currencyFrom,amount,currencyTo);
        if(hasGun) System.out.println("(Be careful, "+getName()+" the ambulant exchanger has a gun...)");
        System.out.println();
    }
}
