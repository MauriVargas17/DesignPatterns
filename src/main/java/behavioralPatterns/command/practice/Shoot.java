package behavioralPatterns.command.practice;

public class Shoot implements ICommand{
    Character c;

    public Shoot(Character c) {
        this.c = c;
    }

    @Override
    public void execute() {
        c.shoot();
    }
}
