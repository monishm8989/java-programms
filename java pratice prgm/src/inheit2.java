public class inheit2 {
      static  int a=10;
    public void m1(){

        System.out.println("hi hello");
    }
}
 class inheit extends inheit2
{
   static  int b=25;
    public void m2()
    {
        System.out.println("hello");
    }
    public static void main(String[] args){
        inheit a1=new inheit();
        inheit3 a2=new inheit3();
    System.out.println(a);
    System.out.println(b);
    a1.m1();
    a1.m2();
    a2.m3();

}

}


class inheit3 extends inheit2{
    public void m3() {
      System.out.println("bye");
    }
}