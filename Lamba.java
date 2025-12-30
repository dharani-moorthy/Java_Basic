package Dharani;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface M{
    void show(int i);
}
public class Lamba {
    public static void main(String[] args) {
        M obj=(i)-> System.out.println("in show"+i);
        obj.show(5);

    }
}
