package Array;

public class RepeatedEle {
    public static void main(String[] args) {
        
        int arr[]={2,6,5,8,8,9,7,1,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    x=1;
                    break;

                }

            }
            if(x==1){
                System.out.println(arr[i]);
            }
        }
    }
}
