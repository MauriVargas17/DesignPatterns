package creationalPatterns.interpreter.practice;

public class One extends Symbol{

    public One(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.output += ones();
        context.output+=" ";
    }

    public String ones(){
        String buffer="";
        for (int i = 0; i < digit; i++){
            buffer+="I";
        }
        return buffer;
    }
}
