import java.util.*;
public class Main {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		    Product product1 = new Product("LED TV", 10);
		    Product product2 = new Product("Mobile", 80);
		    Product product3 = new Product("Tablet", 50);
		    System.out.println("Add three products in inventory:");
		    inventory.addProduct(product1);
		    inventory.addProduct(product2);
		    inventory.addProduct(product3);
		    System.out.println("\nCheck low inventory:");
		    inventory.checkLowInventory();
		    System.out.println("\nRemove Tablet from the inventory!");
		    inventory.removeProduct(product3);
		    System.out.println("\nAgain check low inventory:"); 
		    inventory.checkLowInventory();
		  }

}
