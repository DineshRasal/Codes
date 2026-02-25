package CommonQ;

public class PrimeNoGivenRange {
     public static void main(String[] args) {
        int no1=5;
        int no2=29;

        

        boolean isPrime=true;
        for(int i=no1;i<=no2;i++){
            if(no1%i==0){
                isPrime=false;
                break;
            }
            else{
                System.out.println(no1);
            }
        }

        


    }
}
