package behavioralPatterns.visitor.practice;

public interface IViajero {
    double cambiar(Brasil brasil, double amount, String from);
    double cambiar(Argentina argentina, double amount, String from);
    double cambiar(Bolivia bolivia, double amount, String from);
    double cambiar(Italia italia, double amount, String from);

}
