package CommonQ;

public class Reverse {
    public static void main(String[] args) {
        
        int num=1234;
        int rev=0;
          System.out.println("Original Number"+num);
        while (num!=0) {
           int rem=num%10;
            rev=rev*10+rem;
           num=num/10;
           
        }
        System.out.print("Reversed number:"+rev);
    }
}
