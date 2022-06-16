package demo;

public class pare {
public void vechile(){
    System.out.println("i want to by car");

}
}
class chiloverr extends pare{
    public void vechile(){
        System.out.println("i want to buy a bike");}


    public static void main(String[] args){
    chiloverr c=new chiloverr();
    c.vechile();
    pare p=new pare();
    p.vechile();
}}

