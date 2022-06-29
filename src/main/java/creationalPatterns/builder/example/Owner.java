package creationalPatterns.builder.example;

public class Owner {
    private PCBuilder builder;

    public PC getPC(){
        return builder.getPc();
    }

    public void setBuilder(PCBuilder builder) {
        this.builder = builder;
    }

    public void createPC(){
        this.builder.createPC();
        this.builder.buildMemory();
        this.builder.buildKeyboard();
        this.builder.buildMonitor();
        this.builder.buildMouse();
        this.builder.buildVideo();
        this.builder.buildProcessor();
    }
}
