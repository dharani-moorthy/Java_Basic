package Dharani;

enum Q{
        running,failed, pending ,success;
    }

public class Enum_if_else {
    public static void main(String[] args) {
        Q a=Q.pending;
        switch (a){
            case running -> System.out.println("good") ;
            case failed -> System.out.println("try again");
            case pending -> System.out.println("complete fast");
            case success -> System.out.println("u reached your goal!!!..");
            default -> System.out.println("Better luck next time");
        }
        if(a == Q.running){
            System.out.println("good");
        } else if (a==Q.failed) {
            System.out.println("try again");
        } else if (a==Q.pending) {
            System.out.println("complete fast");
        } else if (a==Q.success) {
            System.out.println("u reached your goal!!!..");
        }else
            System.out.println("Better luck next time");
    }
}

