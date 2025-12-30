package New;
class Dha {
    public  final void add(int a, int b) {
        System.out.println(a + b);
    }
    public void show() {
        System.out.println("dddddddd");
    }
}
class Dh extends Dha{
   // public void add(int a,int b){
     //   System.out.println(a+b);
   // }
}
public class Final_key {
    public static void main(String[] args) {
        final int a = 100; // cannot be changed
        System.out.println(a);

        Dha x = new Dha();
        x.show();
        x.add(3, 6);
    }
}