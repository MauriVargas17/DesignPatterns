package structuralPatterns.decorator.practice;

public class Cuenta implements RegistroBancario{

    private int amount;
    private String owner;

    public Cuenta(int amount, String owner) {
        this.amount = amount;
        this.owner = owner;
    }

    public void showAccount(){
        System.out.println("Cuenta de "+owner);
        System.out.println("Balance: "+amount);
        System.out.println();
    }

    @Override
    public void apply() {
        System.out.println("CUENTA> Mostrando cuenta");
        showAccount();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
