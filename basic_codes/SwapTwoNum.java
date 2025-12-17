package basic_codes;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //1st Way To Swap Two Number
        System.out.println("Before Swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swaping");

        System.out.println("a="+a);
        System.out.println("b="+b);

        //2nd Way To Swap Two Number
       
        int c=10;
        int d=5;
        int temp;

         System.out.println("Before Swaping");
        System.out.println("c="+c);
        System.out.println("d="+d);
        temp=c;
        c=d;
        d=temp;

        System.out.println("After Swaping");
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
