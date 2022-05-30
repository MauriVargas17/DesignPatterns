package builder.practice;

public class BeefPizza extends PizzaBaker{

    @Override
    public void chooseName() {
        this.pizza.setName("Beef");
    }

    @Override
    public void chooseIngredients() {
        Ingredient[] i = {new Ingredient("Beef"), new Ingredient("Tomato Sauce"), new Ingredient("Wiener")};
        this.pizza.setIngredients(i);
    }

    @Override
    public void chooseDough() {
        this.pizza.setDough("Rough");
    }

    @Override
    public void chooseCheese() {
        this.pizza.setCheese("Mozzarella");
    }
}
