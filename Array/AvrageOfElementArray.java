package Array;

public class AvrageOfElementArray {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6};

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("Avrage of element is "+avg);
    }
}
