package creationalPatterns.singleton.example.bank;

public class ATM {
    private int id;
    private int userId;

    public void withdraw(int value, int id){
        BalanceMN.getInstance().withdraw(value, "ATM");
    }
}
