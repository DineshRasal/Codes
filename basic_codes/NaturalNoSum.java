package basic_codes;
import java.util.Scanner;

public class NaturalNoSum {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Which You Want Sum");
        int num=sc.nextInt();
        int sum=0;
        sc.close();

        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
