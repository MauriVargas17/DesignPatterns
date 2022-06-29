package creationalPatterns.singleton.example.bank;

public class Branch {
    private String location;
    private int userId;

    public Branch(){

    }

    public void withdraw(int value, int id){
        BalanceMN.getInstance().withdraw(value, "Branch");
    }
}
