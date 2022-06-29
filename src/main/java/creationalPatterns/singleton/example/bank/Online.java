package creationalPatterns.singleton.example.bank;

public class Online {
    private int server;
    private int userId;

    public Online(){

    }

    public void withdraw(int value, int id){
        BalanceMN.getInstance().withdraw(value, "Online bank");
    }
}
