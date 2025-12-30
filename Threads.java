package Dharani;

class d extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("dharani");

            try { // for printing in sequence
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class h extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("dora");
            try {
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        d obj1=new d();
        h obj2=new h();
//        System.out.println(obj1.getPriority());
//        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();

    }
}
