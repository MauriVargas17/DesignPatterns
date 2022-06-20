package structuralPatterns.adapter.practice;

public class TV implements IA2{

    private int costo;
    private int tiempoGarantia;

    public TV(int costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public int getCosto() {
        System.out.print("Costo: ");
        return costo;
    }

    @Override
    public int getTiempoDeGarantia() {
        System.out.print("Tiempo de garantia: ");
        return tiempoGarantia;
    }
}
