package arrayListDemo;

public class Main {
    public static void main(String[] args) {
        groceryList g = new groceryList();
        g.addGroceryItem("Chips");
        g.addGroceryItem("Sauce");
        g.addGroceryItem("Pasta");
        g.printItems();
        g.modifyItem(1,"Ketchup");
        g.printItems();
        g.removeGroceryItem(0);
        g.printItems();
    }

}
