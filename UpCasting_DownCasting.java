package New;
class F {
    public void show1() {
        System.out.println("I am in A");
    }
}
    class G extends F {
        public void show2(){
            System.out.println("I am in B");
        }
}
public class UpCasting_DownCasting {
    public static void main(String[] args) {
        F obj= new F();
        obj.show1(); // normal
        F obj1= new G();
        obj1.show1();//up casting
        G obj2= (G) obj1;
        obj2.show2();//down casting

    }
}
