package structuralPatterns.decorator.example;

public abstract class PluginIDE implements Ide {

    protected Ide Ide;
    protected int costPlugin;
    protected boolean isOpenSource;

    public PluginIDE(Ide ide, int costPlugin, boolean isOpenSource) {
        Ide = ide;
        this.costPlugin = costPlugin;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public void showInformation() {
        Ide.showInformation();
    }

    public int getCostPlugin() {
        return costPlugin;
    }

    public void setCostPlugin(int costPlugin) {
        this.costPlugin = costPlugin;
    }
}