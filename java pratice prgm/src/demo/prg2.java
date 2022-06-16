package demo;

public class prg2 {
    private int a=10;
    private  double b =30.0;

    public int getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
class user {
    public static void main(String[] args) {
        prg2 a1 = new prg2();
        {
            System.out.println(a1.getA());
            System.out.println(a1.getB());
            a1.setA(100);
            System.out.println(a1.getA());
        }
    }
}
