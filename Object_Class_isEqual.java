package New;

class X {
    String a;
    double price;

    @Override
    public String toString() {
      return  a+" "+price;
        //return "hey";
    }
}
public class Object_Class_isEqual {
    public static void main(String[] args) {
        X obj = new X();
        obj.a = "dharani";
        obj.price = 34.455;

        System.out.println(obj); // Calls toString()
    }
}