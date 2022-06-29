package structuralPatterns.bridge.exampleInClass.B;

public class Linux implements IPlatform{

    IArch arch;

    public Linux(IArch arch) {
        this.arch = arch;
    }

    @Override
    public void pickArch() {
        arch.assignArch();
    }
}
