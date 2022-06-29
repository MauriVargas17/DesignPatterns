package creationalPatterns.builder.practice;

public class Client {
    public static void main(String[] args){
        Chef chef = new Chef();
        PizzaBaker pizza = new ClassicPizza();

        chef.setBaker(pizza);
        chef.bakePizza();
        pizza.getPizza().showPizza();

        pizza = new HawaiianPizza();
        chef.setBaker(pizza);
        chef.bakePizza();
        pizza.getPizza().showPizza();

        pizza = new BeefPizza();
        chef.setBaker(pizza);
        chef.bakePizza();
        pizza.getPizza().showPizza();

    }
}
