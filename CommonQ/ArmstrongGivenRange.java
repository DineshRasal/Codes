package CommonQ;

import java.util.Scanner;

public class ArmstrongGivenRange {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;

            while (num>0) {
                int rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if (sum==i) {
            System.out.println(sum+"Armstrong Number");
            
        }
        }
        

        
    }
}
