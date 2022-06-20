package behavioralPatterns.visitor.practice;

public class Argentina implements IPais{

    private double rate = 123.31;

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void receiveViajero(IViajero viajero, double amount, String currencyFrom) {
        System.out.println("Por el cambio se obtiene: "+viajero.cambiar(this, amount, currencyFrom));
    }
}
