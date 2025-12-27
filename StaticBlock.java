class Moobile {
    static String name;
    String net;
    int price;

    static {
        name = "dharani";
        System.out.println("in static block");
    }

    // Correct constructor name
    public Moobile() {
        net = "5g";
        price = 2_000_000; // 20 lakh
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Moobile a = new Moobile(); // calls constructor
        a.price = 455555;          // override price
        a.net = "4g";              // override net

        System.out.println("Name: " + Moobile.name);
        System.out.println("Net: " + a.net);
        System.out.println("Price: " + a.price);
    }
}