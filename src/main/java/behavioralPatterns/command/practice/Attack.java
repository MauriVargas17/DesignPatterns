package behavioralPatterns.command.practice;

public class Attack implements ICommand{

    Character c;

    public Attack(Character c) {
        this.c = c;
    }

    @Override
    public void execute() {
        c.attack();
    }
}
