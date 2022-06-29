package creationalPatterns.builder.practice;

public class Chef {
    private PizzaBaker baker;

    public void setBaker(PizzaBaker baker) {
        this.baker = baker;
    }

    public void bakePizza(){
        baker.createPizza();
        baker.chooseName();
        baker.chooseCheese();
        baker.chooseDough();
        baker.chooseIngredients();
    }
}
