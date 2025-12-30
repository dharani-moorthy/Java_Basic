package Dharani;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface z {
    int add(int i,int j);
}
public class Lam_return {
    public static void main(String[] args) {
        /*
        z obj=new z() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };
        int res= obj.add(4,5);
        System.out.println(res);
         */
      //  z obj=(i,j) -> {return i+j;};
        z obj=(i,j)-> i+j;
        int res= obj.add(4,5);
        System.out.println(res);
    }
}
