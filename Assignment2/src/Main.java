public class CompositePatternDemo{
    public static void main(String[] args) {
        MenuComponent item1 = new MenuItem("Pizza");
        MenuComponent item2 = new MenuItem("Burger");
        MenuComponent item3 = new MenuItem("Salad");

        MenuComponent drinksMenu = new Menu("Drinks");
        ((Menu) drinksMenu).add(new MenuItem("Coke"));
        ((Menu) drinksMenu).add(new MenuItem("Water"));

        MenuComponent mainMenu = new Menu("Main Menu");
        ((Menu) mainMenu).add(item1);
        ((Menu) mainMenu).add(item2);
        ((Menu) mainMenu).add(item3);
        ((Menu) mainMenu).add(drinksMenu);

        mainMenu.show();
    }
}
