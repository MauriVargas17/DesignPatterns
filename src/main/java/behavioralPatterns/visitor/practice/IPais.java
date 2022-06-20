package behavioralPatterns.visitor.practice;

public interface IPais {
    double getRate();
    void receiveViajero(IViajero viajero, double amount, String currencyFrom);
}
