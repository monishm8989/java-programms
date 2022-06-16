public class prc6 {
    public static void main(String[] args){
        int num=153,rem=0,sum=0,temp=num;
        while(num<0){
            rem=num%10;
            sum=sum+( rem *rem*rem);
            num=num/10;
        }
        if(temp == num)
        System.out.println("amstrong number");
        else
            System.out.println(" not amstrong number");




    }


}
