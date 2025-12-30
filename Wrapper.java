package Pack;

public class Wrapper {
    public static void main(String[] args) {
        int num = 7;                        // primitive int
        Integer numm = Integer.valueOf(8);  // wrapper object also known as boxing
        Integer num1 = num;                 // autoboxing
        System.out.println(numm);           // prints 8
        System.out.println(num1);// prints 7
        int a=numm;// auto-unboxing
        System.out.println(a);
        int b=num1.intValue();// un boxing
        System.out.println(b);

        String d="122";
                int num2=Integer.parseInt(d);
        System.out.println(num2*4);

    }
}