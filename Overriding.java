class X{
    public void show(){
        System.out.println("in X");
    }
    public void con(){
        System.out.println("in Con");
    }
}
class Y extends X{
    public void show(){
        System.out.println("in Y");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Y a=new Y();a.show();// it will use the child when it not present it will go to parent show this is known as overridding
        a.con();
    }
}
