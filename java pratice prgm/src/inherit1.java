//multi level inherit
class car{
    void  nano()
    {
        System.out.println("nano car");
    }
}



//parent class
class bike  extends  car{
    void ride(){
        System.out.println("super bikes");
    }

        }
        // child class
        class honda    extends  bike {

    void  bike1(){
        System.out.println("speed bike");
            }
        }

public class inherit1{
    public static void main(String[] arg){
      honda a1 =new honda();
      a1.bike1();
      a1.ride();
      a1.nano();
    }
}
