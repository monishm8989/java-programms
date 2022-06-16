package collecton;
import java.util.LinkedList;
public class link {
    public static void main(String[] args){
        LinkedList A = new LinkedList();{
            A.add(3);
            A.add(4);
            A.add(5);
            A.add("monish");
            A.add(2.2);
            System.out.println(A);
            A.removeFirst();
            System.out.println(A);
        }
    }
}
