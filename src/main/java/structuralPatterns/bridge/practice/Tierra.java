package structuralPatterns.bridge.practice;

public class Tierra implements IMetodo{

    private String tipo = "terrestre";

    @Override
    public double ajustePrecios(double price) {
        return price * 1.05;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}

