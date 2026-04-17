package Array;

public class MaxProductSubArray {
    
    public static void main(String[] args) {
        
    
    int arr[]={2, 3, -2, 4};
    int start=0;
    int end=0;

    int maxProduct=Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
        int product=1;
        for(int j=i;j<arr.length;j++){
            product=product*arr[j];

            if(maxProduct<product){
                maxProduct=product;
                start=i;
                end=j;
             }
        }

    }
      System.out.print("Maximum Product Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    System.out.print(maxProduct);
}
}
