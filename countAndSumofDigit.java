public class countAndSumofDigit {
    
    public static void main(String[] args) {
        int x=3654789;
        int count=0;
        int sum=0;

        while(x!=0)
        {
            int y=x%10; //Last Digit
            sum=sum+y;
            x=x/10;     //Remaining Number
            count++;
        }
        System.out.println("count of digit is "+count);
        System.out.println("sum of digit is "+sum);
    }
}
