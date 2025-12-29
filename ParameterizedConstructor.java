class HUm {
    String a;
    int age;
    //default
    public HUm() {
        this(null, 0);
    }
    // Parameterized constructor
    public HUm(String a, int age) {
        this.a = a;   // 'this' refers to the current object
        this.age = age;
    }
    // Method to display values
    public void display() {
        System.out.println("Name: " + a + ", Age: " + age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        HUm obj1 = new HUm("Alice", 25);
        HUm obj2 = new HUm("Bob", 30);
        HUm aa=new HUm();
        aa.a="dharani";
        aa.age=21;
        aa.display();
        obj1.display();
        obj2.display();

    }
}