package structuralPatterns.decorator.practice;

import java.util.Random;

public class Promocion extends AddOn {

    public Promocion(String addOnName, RegistroBancario reg) {
        super(addOnName, reg);
    }

    @Override
    public void apply(){
        System.out.println("PROMO> Probando tu suerte...");
        int x = new Random().nextInt(100);
        if (x % 2 == 0){
            int saldoNuevo = getReg().getAmount()*2;
            getReg().setAmount(saldoNuevo);
            System.out.println("PROMO> Ganaste el sorteo, duplicas tu saldo: "+saldoNuevo);
        }
        getReg().apply();

    }
}
