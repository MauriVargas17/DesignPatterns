package prototype.practice;

public class Supplier {
    public static void main(String[] args){
        SamsungR10 phone1 = new SamsungR10();
        phone1.setSize(5);
        phone1.setCpu("AMD Ryzen");
        phone1.setMemory(256);
        phone1.setBluetooth(8);
        phone1.setBatteryType("XX34");
        phone1.setCamera("20px");
        phone1.setAndroidVersion(9);
        phone1.setSim(new Sim("Entel", 76754342));
        phone1.setExternalMemoriesCapacity(2);
        Accessory[] acc = {new Headphones(), new Charger(), new Case()};
        phone1.setAccessories(acc);

        SamsungR10 phone2 = (SamsungR10) phone1.clone();
        SamsungR10 phone3 = (SamsungR10) phone1.clone();

        phone2.setSim(new Sim("Entel", 68783241));
        phone3.setSim(new Sim("Tigo", 79895465));

        System.out.println("Phone 1: "+phone1.getSim().getNumber());
        System.out.println("Phone 2: "+phone2.getSim().getNumber());
        System.out.println("Phone 3: "+phone3.getSim().getNumber());
    }
}