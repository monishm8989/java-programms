public class prc10 {
    int emp_id;
    String name;
    prc10(String nam ){
        name=nam;
    }
void display()
{ System.out.println(name);
}
public static void main(String[] arg) {
        prc10 obj = new prc10("monish");
        obj.display();
    }
}
