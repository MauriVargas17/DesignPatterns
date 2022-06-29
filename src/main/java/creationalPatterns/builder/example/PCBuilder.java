package creationalPatterns.builder.example;

public abstract class PCBuilder {
    protected PC pc;

    public PC getPc(){
        return pc;
    }

    public void createPC(){
        this.pc = new PC();
    }

    public abstract void buildMouse();
    public abstract void buildMonitor();
    public abstract void buildKeyboard();
    public abstract void buildVideo();
    public abstract void buildMemory();
    public abstract void buildProcessor();
}
