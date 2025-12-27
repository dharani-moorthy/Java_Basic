class Mobile {
   static String brand="VIVO";
    int price;
    String network;

    public void show() {
        System.out.println(brand + ":"+price+":"+network);
    }
    public static void show1(){
        System.out.println(brand);
    }
}
public class Static {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        //m.brand="VIVO";
        m.network="5G";
        m.price=18_000;

        Mobile mm=new Mobile();
       Mobile.brand="VIVO";
        mm.network="5G";
        mm.price=18_000;

        m.show();
        mm.show();
        Mobile.show1();

    }
}
