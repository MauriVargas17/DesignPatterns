package structuralPatterns.decorator.practice;

public class Client {
    public static void main(String[] args){
        RegistroBancario cuenta = new Cuenta(300, "Bob");
        cuenta = new SeguroCuenta("seguro", cuenta);
        cuenta = new BancaInternet("online", cuenta);
        cuenta = new Promocion("promo", cuenta);

        cuenta.apply();
    }
}
