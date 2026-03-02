package CommonQ;

public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int original=num;
        int rev=0;

        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

        if(original==rev){
            System.out.println("Number is Palindrome: Original="+original+" Reversed="+rev);
        }else{
            System.out.println("Number is Not Palindrome");
        }
    }
}
