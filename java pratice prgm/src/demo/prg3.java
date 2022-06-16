package demo;

public class prg3 {
    public static void main(String[] args){
        try {
            int a =10;
            int b=0;
            int c=a/b;

        }
        catch (ArithmeticException e){
            System.out.println("error is resolved");
        }
        finally {
            System.out.println("no error");
        }
    }
}
