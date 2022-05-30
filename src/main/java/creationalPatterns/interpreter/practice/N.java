package interpreter.practice;

public class N extends Symbol {
    public N(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.output += loop();
        if(digit % 5 != 0){
           context.output += new One(digit % 5).ones();
        }
        context.output+=" ";
    }

    public String oneBeforeN(Context context) {
        return loop();
    }

    private String loop(){
        String buffer="";
        for (int i = 0; i < digit/5; i++){
            buffer+="V";
        }
        return buffer.replace("VV", "X");
    }
}
