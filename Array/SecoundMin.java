package Array;

public class SecoundMin {
    public static void main(String[] args) {
        int arr[]={2,3,6,8,9,4,6,7};

        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                smin=min;
                min=arr[i];  
            }else if (arr[i]>min && arr[i]<smin) {
                smin=arr[i];
            }
        }
        System.out.println("Secound Smallest :"+smin);
    }
}
