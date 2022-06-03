package behavioralPatterns.memento.practice;

import java.util.ArrayList;
import java.util.List;

public class Registrador {
    private Persona state;
    private List<Persona> states = new ArrayList<>();

    public void setRegister(Persona state){
        this.state = state;
    }

    public Memento createRegister(){
        return new Memento(state);
    }

    public Persona restoreRegister(Memento m){
        state = m.getState();
        return state;
    }

    public List<Persona> restoreRegister(List<Memento> m){
        System.out.println("***** restaurando ****");
        for (Memento mem: m){
            states.add(mem.getState());
        }
        return states;
    }
}
