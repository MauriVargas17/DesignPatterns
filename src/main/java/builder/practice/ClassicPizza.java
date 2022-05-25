package builder.practice;

public class ClassicPizza extends PizzaBaker{
    @Override
    public void chooseName() {
        this.pizza.setName("Classic");
    }

    @Override
    public void chooseIngredients() {
        Ingredient[] i = {new Ingredient("Pepperoni"), new Ingredient("Tomato Sauce")};
        this.pizza.setIngredients(i);
    }

    @Override
    public void chooseDough() {
        this.pizza.setDough("Standard");
    }

    @Override
    public void chooseCheese() {
        this.pizza.setCheese("Cheddar");
    }
}
