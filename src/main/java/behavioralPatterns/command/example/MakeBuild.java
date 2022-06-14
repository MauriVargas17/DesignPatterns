package behavioralPatterns.command.example;

import java.util.ArrayList;
import java.util.List;

public class MakeBuild {
    private List<ICommand> commandsIde = new ArrayList<>();

    public void addCommand(ICommand command){
        commandsIde.add(command);
    }

    public void makeBuildCmd(){
        for (ICommand command : commandsIde) {
            command.execute();
        }
        commandsIde.clear();
    }
}
