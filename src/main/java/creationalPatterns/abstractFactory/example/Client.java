package creationalPatterns.abstractFactory.example;

public class Client {
    public static void main(String[] args){
        IDE ide = FactoryIDE.make("eclipse");
        ide.showInfo();
        compile(ide);
        build(ide);
        debug(ide);
    }
    public static void compile(IDE ide){

    }
    public static void build(IDE ide){

    }
    public static void debug(IDE ide){

    }
}
