package Array;

public class SumOfEle {
    public static void main(String[] args) {
        int arr[]={1,5,6,8,9,7,4};

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
