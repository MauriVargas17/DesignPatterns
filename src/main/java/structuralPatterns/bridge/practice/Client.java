package structuralPatterns.bridge.practice;

public class Client {
    public static void main(String[] args){

        EmpresaSA e1 = new EmpresaSA("Pepitolandia", new Aire());
        EmpresaSRL e2 = new EmpresaSRL("Gomitas Gratis", new Tierra());

        Paquete p = new Paquete(300, "Bicicleta");

        e1.enviar(p);
        e2.enviar(p);

        e2.setTipoDeEnvio(new Mar());

        e2.enviar(p);
    }
}
