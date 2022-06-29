package creationalPatterns.interpreter.practice;

import java.util.ArrayList;
import java.util.List;

public class RomanInterpreter {
    private List<Symbol> grammar = new ArrayList<>();
    private Context context;

    public RomanInterpreter(String msgToInterpreter){
        String[] msgArray = msgToInterpreter.split(" ");
        context = new Context(msgArray);
        for (String s : msgArray) {
            if (!s.equals("")){
                int val = Integer.parseInt(s);
                modVerifier(val);
            }
        }
    }

    public void modVerifier(int val){
        if(val % 5 < 4 && val - 5 < 0){
            grammar.add(new One(val));
        }else if(val % 5 == 4){
            grammar.add(new OneBeforeN(val));
        }else{
            grammar.add(new N(val));
        }
    }

    public String evaluateMsg(){

        for (Symbol expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }

}
