public class Switch {
    public static void main(String[] args) {
        String a = "wednesday";
        String res = "";
        res= switch (a)
        {
//            case "tuesday" -> System.out.println("6");
//            case "thursday" -> System.out.println("7");
//            case "friday", "saturday" -> System.out.println("8");
//            default -> System.out.println("10");
           // case "monday" -> res = "ddddd";
            case "wednesday":yield "ddd";
            default:yield "ss";
        };
        System.out.println(res);
    }
}