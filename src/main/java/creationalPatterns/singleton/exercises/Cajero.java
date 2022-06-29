package creationalPatterns.singleton.exercises;

public class Cajero {
    private int codigo = 123;

    public Cajero() {
       System.out.println("Mi codigo es: "+codigo);
    }

    public void receiveMoney(int amount){
        Ventanilla.setBalance(amount);
        System.out.println("Balance: "+Ventanilla.getBalance());
    }

    public void askBalance(){
        System.out.println("Balance: "+Ventanilla.getBalance());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
