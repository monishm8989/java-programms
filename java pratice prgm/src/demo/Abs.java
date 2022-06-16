package demo;

  abstract public class Abs {
      abstract public void add();
abstract public void mul();

}
abstract class Abs1 extends Abs{
      public void add(){
          System.out.println("addition of two no  are  "+(3+3));
      }
}
 class Abs2 extends Abs1{
    @Override
    public void mul() {
        System.out.println("mul of two numbers are     "+(7*7));
    }
    public static void main(String[]args){
        Abs2 a1=new Abs2();
        a1.add();
        a1.mul();
    }
}