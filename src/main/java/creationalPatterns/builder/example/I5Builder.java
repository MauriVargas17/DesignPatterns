package creationalPatterns.builder.example;

public class I5Builder extends PCBuilder{

    @Override
    public void buildMouse() {
        this.pc.setMouse("Apple");
    }

    @Override
    public void buildMonitor() {
        this.pc.setMonitor("Samsung");
    }

    @Override
    public void buildKeyboard() {
        this.pc.setKeyboard("Mechanical");
    }

    @Override
    public void buildVideo() {
        this.pc.setVideo("AMD 230X");
    }

    @Override
    public void buildMemory() {
        this.pc.setMemory("256");
    }

    @Override
    public void buildProcessor() {
        this.pc.setProcessor("i5");
    }
}
