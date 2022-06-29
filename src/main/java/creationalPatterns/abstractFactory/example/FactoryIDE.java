package creationalPatterns.abstractFactory.example;

public class FactoryIDE {
    public static IDE make(String ideType){
        IDE ide;
        switch (ideType.toLowerCase()){
            case "eclipse": ide = new Eclipse(); break;
            case "visual code": ide = new VisualCode(); break;
            default: ide = new IntelliJ(); break;
        }
        return ide;
    }
}
