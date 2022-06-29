package creationalPatterns.builder.practice;

public class HawaiianPizza extends PizzaBaker{
    @Override
    public void chooseName() {
        this.pizza.setName("Hawaiian");
    }

    @Override
    public void chooseIngredients() {
        Ingredient[] i = {new Ingredient("Pineapple"), new Ingredient("Tomato Sauce"), new Ingredient("Ham")};
        this.pizza.setIngredients(i);
    }

    @Override
    public void chooseDough() {
        this.pizza.setDough("Sweet");
    }

    @Override
    public void chooseCheese() {
        this.pizza.setCheese("Parmesan");
    }
}
