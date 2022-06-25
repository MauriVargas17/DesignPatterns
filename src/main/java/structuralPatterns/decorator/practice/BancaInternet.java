package structuralPatterns.decorator.practice;

public class BancaInternet extends AddOn{

    private boolean enable = false;

    public BancaInternet(String addOnName, RegistroBancario reg) {
        super(addOnName, reg);
    }

    @Override
    public void apply(){
        System.out.println("INTERNET> Habilitando banca por internet...");
        enable = true;
        getReg().apply();
    }
}
