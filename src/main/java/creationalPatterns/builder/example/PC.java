package creationalPatterns.builder.example;

public class PC {
    private String memory;
    private String video;
    private String mouse;
    private String keyboard;
    private String processor;
    private String monitor;

    public void showInfo(){
        System.out.println("Monitor: "+monitor);
        System.out.println("Video: "+video);
        System.out.println("Mouse: "+mouse);
        System.out.println("Keyboard: "+keyboard);
        System.out.println("Processor: "+processor);
        System.out.println("Memory: "+memory);
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
