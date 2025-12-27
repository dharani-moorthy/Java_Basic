class ddd{
   public void play(){
       System.out.println("play the musics");
    }
    public String getme(int cost){
       return "pen";
    }
}
public class method {
    public static void main(String[] args) {
        ddd obj=new ddd();
        obj.play();
         String str=obj.getme(10);
        System.out.println(str);

    }

}
