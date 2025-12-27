public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("dharanidora");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(4));
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        sb.substring(3,6);
        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);
    }
}
