package Interview;

public class PDiamond {
    public static void mian(String args []){

        int n=5;

        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        //Reverse
         for(int i=n;i>=1;i--){
            //Spaces
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
