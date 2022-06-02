package behavioralPatterns.mediator.practice;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{

    Map<Integer, Persona> list = new HashMap<>();

    public Skype addList(Persona persona){
        list.put(persona.getCi(), persona);
        return this;
    }

    @Override
    public void send(String msg, Persona persona) {
        for(Map.Entry<Integer, Persona> p: list.entrySet()){
            if(persona.getCi()!=(p.getValue().getCi())){
                if(p.getValue() instanceof Developer && persona instanceof Developer){
                    p.getValue().receive(msg);
                } else if (p.getValue() instanceof QA && persona instanceof QA){
                    p.getValue().receive(msg);
                } else if (persona instanceof SM){
                    p.getValue().receive(msg);
                }
            }
        }
    }
}
