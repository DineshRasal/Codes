package Array;

public class CountEvenOdd {
    
    public static void main(String[] args) {
        
        int arr[]={2,3,4,5,6,7,8,9};
        int n=arr.length;

        int ecount=0;
        int ocount=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println("Even Element="+arr[i]);
                ecount++;
            }else{
                System.out.println("Odd Element="+arr[i]);
                ocount++;
            }
        }
        System.out.println(ecount);
        System.out.println(ocount);
    }
}
