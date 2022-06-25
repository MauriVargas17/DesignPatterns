package structuralPatterns.decorator.practice;

public class SeguroCuenta extends AddOn {

    public SeguroCuenta(String addOnName, RegistroBancario reg) {
        super(addOnName, reg);
    }

    @Override
    public void apply(){
        System.out.println("SEGURO> Descontando costo de seguro...");
        getReg().setAmount(getReg().getAmount() - 15);
        getReg().apply();
    }
}
