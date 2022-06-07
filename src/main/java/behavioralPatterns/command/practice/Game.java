package behavioralPatterns.command.practice;

public class Game {
    public static void main(String[] args){
        Character bob = new Character("Bob", 31, "Mind reader");
        ActionsExecutor actionsExecutor = new ActionsExecutor();

        Attack attack = new Attack(bob);
        Defend defend = new Defend(bob);
        Shoot shoot = new Shoot(bob);

        actionsExecutor.addCommand(shoot).addCommand(defend).addCommand(attack);

        actionsExecutor.callAll();
    }
}
