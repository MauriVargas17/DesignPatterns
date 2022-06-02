package behavioralPatterns.mediator.practice;

public class Client {
    public static void main(String[] args){
        Skype skype = new Skype();

        Developer d1 = new Developer(skype);
        d1.setName("Bob");
        d1.setCi(123456);
        d1.setLanguage("Go");
        Developer d2 = new Developer(skype);
        d2.setName("Dian");
        d2.setCi(245346);
        d2.setLanguage("Java");
        Developer d3 = new Developer(skype);
        d3.setName("Carlos");
        d3.setCi(697795);
        d3.setLanguage("C++");

        QA qa1 = new QA(skype);
        qa1.setName("Juan");
        qa1.setCi(125446);
        qa1.setGrado("Pro");
        QA qa2 = new QA(skype);
        qa2.setName("Ulises");
        qa2.setCi(9604594);
        qa2.setGrado("Mega pro");
        QA qa3 = new QA(skype);
        qa3.setName("Paul");
        qa3.setCi(2342126);
        qa3.setGrado("Noob");

        SM sm1 = new SM(skype);
        sm1.setName("Oscar");
        sm1.setCi(134426);
        sm1.setCerti("Master");
        SM sm2 = new SM(skype);
        sm2.setName("Eduardo");
        sm2.setCi(764336);
        sm2.setCerti("Master");
        SM sm3 = new SM(skype);
        sm3.setName("Trevor");
        sm3.setCi(968459);
        sm3.setCerti("Master");

        skype.addList(d1).addList(d2).addList(d3);
        skype.addList(qa1).addList(qa2).addList(qa3);
        skype.addList(sm1).addList(sm2).addList(sm3);

        sm1.send("Hola a todos");
        qa1.send("Esto es para los qa");
        d1.send("Esto es para los devs");
    }
}
