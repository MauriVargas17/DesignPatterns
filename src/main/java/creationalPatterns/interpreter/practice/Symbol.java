package creationalPatterns.interpreter.practice;

public abstract class Symbol {
    public int digit;
    public abstract void interpreter(Context context);
}
