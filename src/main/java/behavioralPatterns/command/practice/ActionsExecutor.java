package behavioralPatterns.command.practice;

import java.util.ArrayList;
import java.util.List;

public class ActionsExecutor {
    private List<ICommand> commands = new ArrayList<>();

    public ActionsExecutor addCommand(ICommand command){
        commands.add(command);
        return this;
    }

    public void callAll(){
        for (ICommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
