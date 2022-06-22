package structuralPatterns.bridge.practice;

public class Aire implements IMetodo{

    private String tipo = "aereo";

    @Override
    public double ajustePrecios(double price) {
        return price * 1.1;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
