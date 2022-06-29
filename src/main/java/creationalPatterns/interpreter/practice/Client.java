package creationalPatterns.interpreter.practice;

public class Client {
    public static void main (String[]args){
        // Works perfectly for all numbers from 1 through 39
        String msg = "";
        for(int i = 1; i < 40; i++){
            msg+=i+" ";
        }
        RomanInterpreter parser = new RomanInterpreter(msg);
        System.out.println("Interpretation: "+parser.evaluateMsg());
    }
}
