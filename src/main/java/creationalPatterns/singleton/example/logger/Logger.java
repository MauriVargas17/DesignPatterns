package creationalPatterns.singleton.example.logger;

import java.util.Date;

public class Logger {
    private static Logger instance;

    private Logger(){
        System.out.println(new Date()+ "-INFO > Starting Logger");
    }

    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void info(String value){
        System.out.println(new Date()+ "-INFO > "+value);
    }

    public void warning(String value){
        System.out.println(new Date()+ "-WARNING > "+value);
    }

    public void error(String value){
        System.out.println(new Date()+ "-ERROR > "+value);
    }
}
