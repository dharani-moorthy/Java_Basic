package Dharani;
interface D{
    int age=21;// where the values are final and static
    String name="ooty";
    void show();
    void config();

}
class E implements D{
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }
}
public class interfacee {
    public static void main(String[] args) {
        D obj= new E();
        obj.config();
        obj.show();
        System.out.println(D.age);
    }
}
