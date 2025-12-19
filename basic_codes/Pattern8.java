package basic_codes;

public class Pattern8 {
    
    public static void main(String[] args) {
       
       // Pattern 8
       
        // *****
        // *   *
        // *   *
        // *****
    int n=4;
    int m=5;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){

            if(i==1 || i==n || j==1 ||j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}