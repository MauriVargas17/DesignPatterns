package structuralPatterns.decorator.practice;

public abstract class AddOn implements RegistroBancario{
    private String addOnName;
    private RegistroBancario reg;

    public AddOn(String addOnName, RegistroBancario reg) {
        this.addOnName = addOnName;
        this.reg = reg;
    }

    public int getAmount(){
        return reg.getAmount();
    }

    public void setAmount(int a){
        reg.setAmount(a);
    }

    @Override
    public void apply() {
        reg.apply();
    }

    public String getAddOnName() {
        return addOnName;
    }

    public void setAddOnName(String addOnName) {
        this.addOnName = addOnName;
    }

    public RegistroBancario getReg() {
        return reg;
    }

    public void setReg(RegistroBancario reg) {
        this.reg = reg;
    }
}
