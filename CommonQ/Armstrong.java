package CommonQ;

public class Armstrong {
    public static void main(String[] args) {
        
        int no=1523;
        int t1=no;
        int len=0;
        int arm=0;

        while(t1!=0){
            len=len+1;
            t1=t1/10;
            
        }

        int t2=no;
        while(t2!=0){
           int rem=t2%10;
            int mul=1;
            for(int i=1;i<=len;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if (arm==no) {
            System.out.println("Armstrong Number");
            
        }else{
            System.out.println("Number is Not Armstrong");
        }
    }
}
