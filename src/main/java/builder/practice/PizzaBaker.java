package builder.practice;

public abstract class PizzaBaker {
    protected Pizza pizza;

    public void createPizza(){
        this.pizza = new Pizza();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void chooseName();
    public abstract void chooseIngredients();
    public abstract void chooseDough();
    public abstract void chooseCheese();
}
