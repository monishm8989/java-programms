public class exam {
      int a=10;
  public void m1(){
      int a=40;
      System.out.println(a);
      System.out.println(this.a);
      this.a=600;
      System.out.println(this.a);
  }
    public static void main(String[] arg){

      exam a1=new exam();
      a1.m1();

       // System.out.println( a);
       // System.out.println( name);*//


    }



}
