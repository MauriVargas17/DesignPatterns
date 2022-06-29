package creationalPatterns.prototype.exercises;

public class School {
    public static void main(String[] args){
        Contract contract1 = new Contract();
        contract1.setName("Robert");
        contract1.setLastname("Adams");
        System.out.println(contract1.getName()+" "+contract1.getLastname());

        Contract contract2 = (Contract) contract1.clone();
        contract2.setName("Patty");
        contract2.setLastname("Johnson");
        System.out.println(contract2.getName()+" "+contract2.getLastname());
        Contract contract3 = (Contract) contract1.clone();
        Contract contract4 = (Contract) contract1.clone();
        Contract contract5 = (Contract) contract1.clone();
        Contract contract6 = (Contract) contract1.clone();
        Contract contract7 = (Contract) contract1.clone();
        Contract contract8 = (Contract) contract1.clone();
        Contract contract9 = (Contract) contract1.clone();
        Contract contract10 = (Contract) contract1.clone();
        Contract contract11 = (Contract) contract1.clone();
        Contract contract12 = (Contract) contract1.clone();
        Contract contract13 = (Contract) contract1.clone();
        Contract contract14 = (Contract) contract1.clone();
        Contract contract15 = (Contract) contract1.clone();




    }
}
