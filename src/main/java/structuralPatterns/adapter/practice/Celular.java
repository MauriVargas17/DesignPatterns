package structuralPatterns.adapter.practice;

public class Celular implements IA1{

    private int precio;
    private int tiempoVida;

    public Celular(int precio, int tiempoVida) {
        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public int getPrecio() {
        System.out.print("Precio: ");
        return precio;
    }

    @Override
    public int getTiempoDeVida() {
        System.out.print("Tiempo de vida: ");
        return tiempoVida;
    }
}
