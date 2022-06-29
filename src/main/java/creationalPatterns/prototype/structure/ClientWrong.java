package creationalPatterns.prototype.structure;

public class ClientWrong {
    public static void main(String[] args){
        User john = new User();
        john.setAttribute1(1);
        john.setAttribute2(2);
        john.setAttribute3(3);
        john.setAttribute4(4);
        john.setAttribute5(5);
        john.setAttribute6(6);

        System.out.println("John > "+john.getAttribute1());
        System.out.println("John > "+john.getAttribute2());
        System.out.println("John > "+john.getAttribute3());
        System.out.println("John > "+john.getAttribute4());
        System.out.println("John > "+john.getAttribute5());
        System.out.println("John > "+john.getAttribute6());

        // By doing this, we are not creating a new instance
        // only creating a new pointer to the same 'john' object
        User tyler = new User();
        tyler = john;

        System.out.println("Tyler hashcode: "+tyler.hashCode());
        System.out.println("John hashcode: "+john.hashCode());


        System.out.println("Tyler > "+tyler.getAttribute1());
        System.out.println("Tyler > "+tyler.getAttribute2());
        System.out.println("Tyler > "+tyler.getAttribute3());
        System.out.println("Tyler > "+tyler.getAttribute4());
        System.out.println("Tyler > "+tyler.getAttribute5());
        System.out.println("Tyler > "+tyler.getAttribute6());

        tyler.setAttribute3(33);

        System.out.println("John > "+john.getAttribute3());
        System.out.println("Tyler > "+tyler.getAttribute3());



    }

}
