package Dharani;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        System.out.println("enter the value of num:");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
       int num= Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
}
