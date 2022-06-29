package creationalPatterns.singleton.exercises;

public class Client {
    public static void main(String[] args){
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();
        Estudiante e4 = new Estudiante();
        Estudiante e5 = new Estudiante();

        Cajero c = new Cajero();
        c.setCodigo(1234);

        e1.pagar(c);
        e2.pagar(c);
        e3.pagar(c);
        e4.pagar(c);
        e5.pagar(c);
    }



}
