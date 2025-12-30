package Dharani;
 abstract class car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("play my fav music");
    }
}
class newCar extends car{
    public void drive(){
        System.out.println("this is Special");
    }
}
public class Abstract {
    public static void main(String[] args) {
        car obj=new newCar();
        obj.drive();
        obj.playMusic();
    }
}
