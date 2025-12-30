package Dharani;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num =scan.nextInt();
        String a=scan.next();
        char ch=scan.next().charAt(0);
        double d=scan.nextDouble();
        System.out.println(num+":"+a+":"+ch+":"+d+":");
        scan.close();
    }

}
