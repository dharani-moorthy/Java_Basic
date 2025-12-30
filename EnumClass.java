package Dharani;

enum Laptop {
    macbook(2200), dell(50000), victors, surface(33333);
    private int price;
    // Default constructor
    private Laptop() {
        price = 500; // default price
    }
    // Parameterized constructor
    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.dell;
        System.out.println("Selected: " + lap + " → " + lap.getPrice());
        System.out.println("\nAll laptops:");
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
        // Example of changing price
        Laptop.victors.setPrice(9999);
        System.out.println("\nAfter updating victors price:");
        System.out.println("victors : " + Laptop.victors.getPrice());
    }
}