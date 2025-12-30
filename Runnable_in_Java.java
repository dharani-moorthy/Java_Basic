package Dharani;
class X{
}
class j implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("dharani");

            try { // for printing in sequence
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class K implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("dora");
            try {
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Runnable_in_Java {
    public static void main(String[] args) {
        Runnable obj1=new j();
        Runnable obj2=new K();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}
