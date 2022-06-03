package behavioralPatterns.memento.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BDD {
    private ArrayList<Memento> register = new ArrayList<>();

    public ArrayList<Memento> getRegister() {
        return register;
    }

    public void createRegister(Memento m){
        register.add(m);
    }

    public List<Memento> getRegister(int index){

        List<Memento> m;
        Backups b = Backups.values()[index];
        System.out.println(b);
        switch(b){
            case BackupMarzo -> m = register.subList(0,1);
            case BackupAbril -> m = register.subList(0,2);
            case BackupMayo -> m = register.subList(0,3);
            case BackupJunio -> m = register.subList(0,4);
            default -> m = register.subList(0,5);
        }
        return m;
    }

    private ArrayList<Memento> addMarzo(ArrayList<Memento> m, Map<String, Memento> register){
        m.add(register.get("BackupMarzo"));
        return m;
    }

    private ArrayList<Memento> addAbril(ArrayList<Memento> m, Map<String, Memento> register){
        m.add(register.get("BackupMarzo"));
        m.add(register.get("BackupAbril"));
        return m;
    }

    private ArrayList<Memento> addMayo(ArrayList<Memento> m, Map<String, Memento> register){
       m.add(register.get("BackupMarzo"));
        m.add(register.get("BackupAbril"));
        m.add(register.get("BackupMayo"));

        return m;
    }

    private ArrayList<Memento> addJunio(ArrayList<Memento> m, Map<String, Memento> register){
        m.add(register.get("BackupMarzo"));
        m.add(register.get("BackupAbril"));
        m.add(register.get("BackupMayo"));
        m.add(register.get("BackupJunio"));

        return m;
    }

    private ArrayList<Memento> addJulio(ArrayList<Memento> m, Map<String, Memento> register){
        m.add(register.get("BackupMarzo"));
        m.add(register.get("BackupAbril"));
        m.add(register.get("BackupMayo"));
        m.add(register.get("BackupJunio"));
        m.add(register.get("BackupJulio"));

        return m;
    }

}
