package creationalPatterns.prototype.structure;

public class Client1 {
    public static void main(String[] args){

        ConcretePrototype1 obj1 = new ConcretePrototype1();
        obj1.setAttribute1(1);
        obj1.setAttribute2(2);
        obj1.setAttribute3(3);
        obj1.setAttribute4(4);
        obj1.setAttribute5(5);
        obj1.setAttribute6(6);

        ConcretePrototype1 obj2 = (ConcretePrototype1) obj1.clone();

        obj2.setAttribute1(11);

        System.out.println("Obj1 hashcode: "+obj1.hashCode());
        System.out.println("Obj2 hashcode: "+obj2.hashCode());

        System.out.println("Obj1: "+obj1.getAttribute2());
        System.out.println("Obj2: "+obj2.getAttribute2());

    }
}
