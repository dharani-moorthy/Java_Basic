package Dharani;

public class Throw_e {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if (j==0){
                throw new ArithmeticException("i dont want zero");
            }
        }catch (ArithmeticException e){
            j=18/1;
            System.out.println("Mathematical error...."+e);
            System.out.println("this is default..");
        }
        catch (Exception e){
            System.out.println("some error...");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
