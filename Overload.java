class calc{
    public int add(int n1,int n2){
        int res=n1+n2;
        return res;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class Overload {
    public static void main(String[] args) {
        calc d=new calc();
        int a=d.add(4,6);
        System.out.println(a);
    }
}
