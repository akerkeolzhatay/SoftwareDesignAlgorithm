// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            Product original = new Product("Laptop", 1500.00);
            Product clone = (Product) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Clone: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
