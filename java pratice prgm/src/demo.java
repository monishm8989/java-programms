
interface me{
    void add();
}

public class demo implements me {
    public void add() {
        System.out.println((5+5));
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.add();
    }
}