package structuralPatterns.bridge.exampleInClass.B;

public class Windows implements IPlatform{

    IArch arch;

    public Windows(IArch arch) {
        this.arch = arch;
    }

    @Override
    public void pickArch() {
        arch.assignArch();
    }
}
