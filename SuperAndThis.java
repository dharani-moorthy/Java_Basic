class D{   //Super Class
    public D() {
        System.out.println("in D");
    }
        public D(int a) {
        this();
            System.out.println("in a int");
        }

}
class C extends D{// Sub Class
   public C(){
       super(6);
       System.out.println("in C");
    }

    public C(int n){
       // super(n);
        this();
        System.out.println("in n int");
    }
}
public class SuperAndThis {
    public static void main(String[] args) {
        C a=new C(4);

    }
}
