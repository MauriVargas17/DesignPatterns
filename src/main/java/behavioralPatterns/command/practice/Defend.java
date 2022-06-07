package behavioralPatterns.command.practice;

public class Defend implements ICommand{
    Character c;

    public Defend(Character c) {
        this.c = c;
    }

    @Override
    public void execute() {
        c.defend();
    }
}
