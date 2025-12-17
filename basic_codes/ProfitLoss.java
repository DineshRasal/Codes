package basic_codes;

import java.util.Scanner;

public class ProfitLoss {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost Price and Selling Price");
        int cp=sc.nextInt();
        System.out.println("Enter Selling Price");
        int sp=sc.nextInt();
        sc.close();


        if(sp>cp)
        {
            int profit=sp-cp;
            System.out.println("Profit is:"+profit);

        }
        else{
            int loss=cp-sp;
            System.out.println("Loss is:"+loss);
        }
    }
}
