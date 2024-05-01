//InventoryManagementGUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    }

    public void updateProduct(String name, int newQuantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setQuantity(newQuantity);
                return;
            }
        }
    }

    public void deleteProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
    }

    public Product searchProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for (Product p : products) {
            report.append("Product: ").append(p.getName()).append(", Quantity: ").append(p.getQuantity()).append("\n");
        }
        return report.toString();
    }
}

public class InventoryManagementGUI extends JFrame implements ActionListener {
    private JTextField nameField, quantityField;
    private JTextArea outputArea;
    private Inventory inventory;

    public InventoryManagementGUI() {
        super("Inventory Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        inventory = new Inventory();

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Product Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        inputPanel.add(quantityField);

        JButton addButton = new JButton("Add Product");
        addButton.addActionListener(this);
        inputPanel.add(addButton);

        JButton reportButton = new JButton("Generate Report");
        reportButton.addActionListener(this);
        inputPanel.add(reportButton);

        JPanel outputPanel = new JPanel(new BorderLayout());
        outputArea = new JTextArea();
        outputPanel.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(outputPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Add Product")) {
            String name = nameField.getText();
            int quantity = Integer.parseInt(quantityField.getText());
            inventory.addProduct(name, quantity);
            outputArea.setText("Product added successfully.");
            nameField.setText("");
            quantityField.setText("");
        } else if (command.equals("Generate Report")) {
            outputArea.setText(inventory.generateReport());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InventoryManagementGUI gui = new InventoryManagementGUI();
            gui.setVisible(true);
        });
    }
}
