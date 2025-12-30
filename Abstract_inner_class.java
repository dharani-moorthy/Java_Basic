package Dharani;

 abstract class b {
    public  abstract void show() ;
}
//class C extends b{
//     public void show(){
//         System.out.println("i am show");
//     }
//
//}
public class Abstract_inner_class {
    public static void main(String[] args) {
        b obj=new b(){
            public void show(){
                System.out.println("in new show");
            }
            public void show1(){
                System.out.println("in new show1");
            }
        };
        obj.show();
    }
}
