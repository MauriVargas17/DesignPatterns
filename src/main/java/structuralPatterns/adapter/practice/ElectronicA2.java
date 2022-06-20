package structuralPatterns.adapter.practice;

public class ElectronicA2 implements IA1{

    private TV tv;

    public ElectronicA2(TV tv) {
        this.tv = tv;
    }

    @Override
    public int getPrecio() {
        return tv.getCosto();
    }

    @Override
    public int getTiempoDeVida() {
        return tv.getTiempoDeGarantia();
    }
}
