package enums;

public enum FoodMenu {
    BREAKFAST("Coffee", "English Breakfast", "Souffle"),
    LUNCH("Salad","Steak and spagetti", "Ice cream"),
    DINNER("Lemonade","Butter chicken","Cheese Cake");

    private final String appetizer;
    private final String main;
    private final String dessert;

    FoodMenu(final String appetizer, final String main, final String dessert){
        this.appetizer=appetizer;
        this.main=main;
        this.dessert=dessert;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public String getMain() {
        return main;
    }

    public String getDessert() {
        return dessert;
    }
}
