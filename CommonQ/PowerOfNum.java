package CommonQ;

public class PowerOfNum {
    public static void main(String[] args) {
        int num=5;
        int power=2;
        int result=1;

        for(int i=1;i<=power;i++){

            result=num*result;
        }
        System.out.println("Power is:"+result);
    }
}
