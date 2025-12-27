class  std{
    int roll;
    String name;
    int mark;
}
public class ArrayObject {
    public static void main(String[] args) {
//        int num[]=new int[6];
//        num[0]=8;
//        num[1]=6;
//        num[2]=9;
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);

        std s=new std();
        s.roll=1;
        s.mark=9;
        s.name="dharani";
        std s1=new std();
        s1.roll=2;
        s1.mark=9;
        s1.name="dha";
        std s2=new std();
        s2.roll=3;
        s2.mark=9;
        s2.name="dhara";

        std ss[]=new std[3];
        ss[0]=s;
        ss[1]=s1;
        ss[2]=s2;
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i].mark+":"+ss[i].name+":"+ss[i].roll);
        }


    }
}
