package behavioralPatterns.visitor.practice;

public class LibreCambista implements IViajero{

    @Override
    public double cambiar(Brasil brasil, double amount, String from) {
        System.out.println("Cambiando y visitando Brasil!");
        double a = Math.round(brasil.getRate() * amount * 100.0) / 100.0;
        double b = Math.round(amount/brasil.getRate() * 100.0) / 100.0;
        return from.equals("USD") ? a : b;
    }

    @Override
    public double cambiar(Argentina argentina, double amount, String from) {
        System.out.println("Cambiando y visitando Argentina!");
        double a = Math.round(argentina.getRate() * amount * 100.0) / 100.0;
        double b = Math.round(amount/argentina.getRate() * 100.0) / 100.0;
        return from.equals("USD") ? a : b;
    }

    @Override
    public double cambiar(Bolivia bolivia, double amount, String from) {
        System.out.println("Cambiando y visitando Bolivia!");
        double a = Math.round(bolivia.getRate() * amount * 100.0) / 100.0;
        double b = Math.round(amount/bolivia.getRate() * 100.0) / 100.0;
        return from.equals("USD") ? a : b;
    }

    @Override
    public double cambiar(Italia italia, double amount, String from) {
        System.out.println("Cambiando y visitando Italia!");
        double a = Math.round(italia.getRate() * amount * 100.0) / 100.0;
        double b = Math.round(amount/italia.getRate() * 100.0) / 100.0;
        return from.equals("USD") ? a : b;
    }
}
