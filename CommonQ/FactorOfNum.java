package CommonQ;

public class FactorOfNum {
    public static void main(String[] args) {
        
        int num=10;

        for(int i=1;i<=10;i++){

            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
