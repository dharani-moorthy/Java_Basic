package Dharani;
@java.lang.FunctionalInterface
interface s{
    void show();
}
public class FunctionalInterface {
    public static void main(String[] args) {
        s obj=new s(){
           public void show(){
               System.out.println("in show");
           }
        };
        obj.show();
    }
}
