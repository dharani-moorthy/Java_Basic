class l{
private int age;
private String name="dharani";
public int getAge() {
    return age;
}
public String getName(){
    return name;
}
public void setAge(int age){
   this.age=age;
}
}
public class This {
    public static void main(String[] args) {
        l h=new l();
        h.setAge(21);
        System.out.println(h.getAge());
        System.out.println(h.getName());

    }
}
