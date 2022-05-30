package interpreter.example;

public class Number extends OperationM {

    public Number(int digit){
        this.digit=digit;
    }

    @Override
    public void interpreter(Context context) {
        System.out.println("Digit from Number: "+digit);
        context.output= context.output+(Integer.parseInt(context.input.substring(0,this.digit))*context.signo);
        context.input= context.input.substring(this.digit);
    }
}