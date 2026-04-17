package Array;

public class Distinct {
    
    public static void main(String[] args) {
        
        int arr[]={1, 2, 2, 3, 3, 4};
        int n=arr.length;
       int count=0;
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    x=1;
                    break;
                }
            }
            if(x==0){
                System.out.println(arr[i]);
                count++; 
            }
        }
        System.out.println("The Count Of Distinct Element in Array:"+count);
    }
}
