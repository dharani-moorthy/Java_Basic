package Dharani;

enum status{
    running,failed, pending ,success;
}
public class Enumm {
    public static void main(String[] args) {
        status s = status.running;
        System.out.println(s.ordinal());
        status[] ss = status.values();
        for (status sss : ss) {
            System.out.println(sss);
            System.out.println(s);
        }
    }
}