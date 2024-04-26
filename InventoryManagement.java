import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, int quantity) {
        products.add(new Product(name, quantity));
        System.out.println("Product added successfully.");
    }

    public void updateProduct(String name, int newQuantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setQuantity(newQuantity);
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                products.remove(p);
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void searchProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Product found: " + p.getName() + ", Quantity: " + p.getQuantity());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void generateReport() {
        System.out.println("Inventory Report:");
        for (Product p : products) {
            System.out.println("Product: " + p.getName() + ", Quantity: " + p.getQuantity());
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Search Product\n5. Generate Report\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(name, quantity);
                    break;
                case 2:
                    System.out.print("Enter product name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    inventory.updateProduct(updateName, newQuantity);
                    break;
                case 3:
                    System.out.print("Enter product name to delete: ");
                    String deleteName = scanner.nextLine();
                    inventory.deleteProduct(deleteName);
                    break;
                case 4:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    inventory.searchProduct(searchName);
                    break;
                case 5:
                    inventory.generateReport();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
