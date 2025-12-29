package Dharani;
@Deprecated
class W{
    public void showTheDataBelongsToThis(){
        System.out.println("in W");
    }
}
class R extends W{
    @Override
    public void showTheDataBelongsToThis() {
        System.out.println("in R");
    }
}
public class Annotation {
    public static void main(String[] args) {
        R obj=new R();
        obj.showTheDataBelongsToThis();
    }
}
