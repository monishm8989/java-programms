// Array list



package collecton;
import java.util.ArrayList;
public class Demo {
    public static void main(String[] args){
        ArrayList a1=new ArrayList();
        a1.add(3);
        a1.add("monish");
        a1.add('b');
        a1.add(4.4);
        System.out.println(a1);
        a1.remove(3);//removed value at index 3
        System.out.println(a1);
        System.out.println(a1.indexOf("monish"));
    }
}
