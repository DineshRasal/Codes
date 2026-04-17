package Array;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum=currSum+arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }
        }
        System.out.println("Max Sum"+maxSum);
    }
}
