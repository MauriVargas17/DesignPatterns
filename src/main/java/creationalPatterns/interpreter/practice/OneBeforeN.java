package interpreter.practice;

public class OneBeforeN extends Symbol {
    public OneBeforeN(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(digit > 10){
            int val = digit;
            if(digit%10==9){
                val = digit - 5;
            }
            context.output+=new N(val).oneBeforeN(context);

        }
        context.output+="I";
        context.output+=new N(digit%10 == 4 ? 5 : 10).oneBeforeN(context);
        context.output+=" ";
    }
}
