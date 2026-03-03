package CommonQ;

public class StrongNumber {
    public static void main(String[] args) {
        
        int num=145;
        int num1=num;
        int sum=0;

        while(num1!=0){
            int ldigit=num1%10;
            int fact=1;

            for(int i=1;i<=ldigit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num1=num1/10;
        }
        if(sum==num){
            System.out.println("It is Strong Number");
        }
        else{
            System.out.println("It is not Strong number");
        }

    }
}
