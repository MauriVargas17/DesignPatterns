package creationalPatterns.singleton.exercises;

public class Ventanilla {
    private static final Ventanilla ventanilla = new Ventanilla();
    private static int balance;

    private Ventanilla(){}

    public Ventanilla getVentanilla(){
        return ventanilla;
    }

    public static int getBalance(){
        return balance;
    }

    public static void setBalance(int amount) {
        balance += amount;
    }
}
