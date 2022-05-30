package singleton.practice;

public class Client {
    public static void main(String[] args){
        Bank usBank = new Bank("US Bank", "La Paz", 1000, 50);
        AmbulantExchanger robert = new AmbulantExchanger("Robert", "La Paz", 200, true);
        ExchangeHouse moneyH = new ExchangeHouse("Money House", "Cochabamba", 1200);

        usBank.exchangeMoney("BOB", 70, "EUR");
        robert.exchangeMoney("SUS", 10, "BOB");
        moneyH.exchangeMoney("EUR", 10, "BOB");

    }
}
