package Dharani;
class a {
    public void show() {
        System.out.println("i am in A show");
    }
}
public class Anonymous_inner_class {
    public static void main(String[] args) {
        a obj=new a(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
