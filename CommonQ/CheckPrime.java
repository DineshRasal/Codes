package CommonQ;

public class CheckPrime {
    public static void main(String[] args) {
        int no=1;

        if(no<=1){
            System.out.println("Number is not prime");
            
        }

        boolean isPrime=true;
        for(int i=2;i<no;i++){
            if(no%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(no+" is prime");
        }
        else{
            System.out.println(" not prime");
        }


    }
}
