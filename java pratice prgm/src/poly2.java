public class poly2 {
    public void ech() {
        System.out.println("i want to by car");
    }
}
    class child extends poly2 {
        public void ech() {
            System.out.println("i want to buy bike");
        }

        public static void main(String[] args) {
            child ob = new child();
            ob.ech();
            poly2 ob1 = new poly2();
            ob1.ech();
        }
    }


