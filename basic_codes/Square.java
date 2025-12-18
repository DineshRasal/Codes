package basic_codes;
import java.util.*;
public class Square {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Which You Want Square");
        int num=sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
