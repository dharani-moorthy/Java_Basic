package Dharani;

public class Try_Resources {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            j=18/i;

        }
        catch (Exception e){
            System.out.println("Some thing went wrong...");

        }
        finally {
            System.out.println("Byee....");

        }
    }
}
