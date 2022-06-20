package structuralPatterns.adapter.practice;

public class Client {
    public static void main(String[] args){
        ElectronicA2 tv = new ElectronicA2(new TV(2000, 5));
        Celular celular = new Celular(500, 2);

        System.out.println(tv.getPrecio());
        System.out.println(tv.getTiempoDeVida());

        System.out.println(celular.getPrecio());
        System.out.println(celular.getTiempoDeVida());

    }
}
