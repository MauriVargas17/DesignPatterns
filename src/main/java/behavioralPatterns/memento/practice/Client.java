package behavioralPatterns.memento.practice;

import java.util.List;

public class Client {
    public static void main(String[] args){
        BDD bdd = new BDD();
        Registrador reg = new Registrador();

        Persona persona;
        persona = new Persona("Ricardo Pari", 123, 30);
        reg.setRegister(persona);
        bdd.createRegister(reg.createRegister());
        persona = new Persona("Eynar Pari", 456, 30);
        reg.setRegister(persona);
        bdd.createRegister(reg.createRegister());
        persona = new Persona("Fernando Lopez", 789, 24);
        reg.setRegister(persona);
        bdd.createRegister(reg.createRegister());
        persona = new Persona("Wilson Mendoza", 101, 54);
        reg.setRegister(persona);
        bdd.createRegister(reg.createRegister());
        persona = new Persona("Julio Perez", 112, 29);
        reg.setRegister(persona);
        bdd.createRegister(reg.createRegister());

        List<Persona> personas = reg.restoreRegister(bdd.getRegister(2));
        for (Persona p: personas){
            System.out.println("Nombre: "+p.getName());
        }
    }
}
