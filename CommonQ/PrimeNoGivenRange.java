package CommonQ;

import java.util.Scanner;

public class PrimeNoGivenRange {
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number ");
      int num=sc.nextInt();

      if(num==2){
        System.out.println("Number Is Prime");

      }else{
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(num);i++){
            
            if(num%i==0){
                isPrime=false;
            }
            
        }
          if( isPrime==true){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number Is Not Prime");
        }
      
      }

        



    }
}
