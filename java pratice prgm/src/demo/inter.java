package demo;

public interface inter {
     String    s="good morning";
     void add();
     void sub();
}
abstract   class impl implements inter{
    public void add(){
        int x=1,y=2;
        System.out.println((x+y));

    }
}
abstract class imp2  extends impl {
    public void sub(){
        int x=2,y=3;
        System.out.println((x-y));
    }
    public static void main(String[] args){
        imp2 i =new imp2() {
        };
        i.add();
        i.sub();}
    }




