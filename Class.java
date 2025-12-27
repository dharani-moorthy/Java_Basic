class cal {
    int a;int b;
    public int add(int num1,int num2 ) {
        int r=num1+num2;
        return r;
    }
}
    public class Class {
        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 6;
            cal c=new cal();// object
          int re= c.add(5,6);//c is referance
          int ee=c.add(num1,num2);
            System.out.println(re);
            System.out.println(ee);

        }
    }
