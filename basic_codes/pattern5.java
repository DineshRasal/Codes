package basic_codes;

public class pattern5 {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==j)
                {
                    System.out.println("$");
                }
                else
                {
                    System.out.print("*");
                }
            }
        }
    }
}

//Pattern two Sysmbols

/*      1  2  3  4
    1   $
    2   *  $
    3   *  *  $
    4   *  *  *  $
*/

