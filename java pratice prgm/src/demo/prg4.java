package demo;
import java.io.*;
public class prg4 {
    public static void main(String[] args){
        try {


            FileOutputStream ob1 = new FileOutputStream("D:\\text.txt");
            String s = "welcome to  my kingdom";
            byte b[]=s.getBytes();
            ob1.write(b);
            ob1.write(29);
            ob1.close();
            System.out.println("byee");
        }
        catch (Exception e){
            System.out.println("hello");
        }


        finally {
            System.out.println("no error ");
        }
    }



}
