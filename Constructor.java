class Hum{
    int age;
    String name;
    public Hum(){
        System.out.println("in constructor");// based on the number of obj created it will print this statement
        // for default we can assign the value
    }
}
public class Constructor {
    public static void main(String[] args) {
        Hum a=new Hum();
        Hum aa=new Hum();
        System.out.println(a.age+":"+a.name);
        a.age=21;
        a.name="dharani";

    }
}
