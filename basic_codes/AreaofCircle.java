package basic_codes;

import java.util.Scanner;

public class AreaofCircle {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Radius");
        double r=sc.nextDouble();
        sc.close();

    double area=(3.14*r*r);
    System.out.println(area);

    }
}
