package creationalPatterns.prototype.structure;

public class ConcretePrototype1 implements IPrototype {
    private int attribute1;
    private int attribute2;
    private int attribute3;
    private int attribute4;
    private int attribute5;
    private int attribute6;

    @Override
    public Object clone(){
        ConcretePrototype1 clone = new ConcretePrototype1();
        clone.setAttribute1(this.getAttribute1());
        clone.setAttribute2(this.getAttribute2());
        clone.setAttribute3(this.getAttribute3());
        clone.setAttribute4(this.getAttribute4());
        clone.setAttribute5(this.getAttribute5());
        clone.setAttribute6(this.getAttribute6());
        return clone;
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public int getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(int attribute3) {
        this.attribute3 = attribute3;
    }

    public int getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(int attribute4) {
        this.attribute4 = attribute4;
    }

    public int getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(int attribute5) {
        this.attribute5 = attribute5;
    }

    public int getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(int attribute6) {
        this.attribute6 = attribute6;
    }
}
