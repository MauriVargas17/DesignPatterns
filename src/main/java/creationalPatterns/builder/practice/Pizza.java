package creationalPatterns.builder.practice;

public class Pizza {
    private String name;
    private Ingredient[] ingredients;
    private String dough;
    private String cheese;

    public void showPizza(){
        System.out.println("This is a "+name+" pizza");
        System.out.println("As ingredients it has: ");
        for(Ingredient i : ingredients) System.out.println("- "+i.getName());
        System.out.println("The type of dough is "+dough);
        System.out.println("The type of cheese is "+cheese);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
}
