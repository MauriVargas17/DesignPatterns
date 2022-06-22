package structuralPatterns.bridge.practice;

public class Mar implements IMetodo{

    private String tipo = "maritimo";

    @Override
    public double ajustePrecios(double price) {
        return price * 1.5;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}

