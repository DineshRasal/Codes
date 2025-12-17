package basic_codes;

public class oddConditions {
    public static void main(String[] args) {
        
        int sum=0;
        for(int i=10;i<=100;i++)
        {
            if(i%2!=0)
            {
                if(i>50)
                {
                    
                    sum=sum+i;
                    
                }
                
            }
           
        }
         System.out.println(sum);
    }
}
