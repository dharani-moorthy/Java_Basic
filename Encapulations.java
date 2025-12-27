class human{
   private int age;
   private String name="dharani";
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;

    }
}
public class Encapulations {
    public static void main(String[] args) {
        human h=new human();
//        h.age=21;
//        h.name="dharani";
        h.setAge(21);
        System.out.println(h.getAge());
        System.out.println(h.getName());

    }
}
