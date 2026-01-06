package Array;

public class LargestEleArray {
    public static void main (String args []){
        int[] num={1,2,3,4,8,9,10};

        int max=num[0];

        for(int i=1;i<num.length;i++){
            if (num[i]>max) {
                max=num[i];
                
            }
        }
        System.out.println("Largest element is "+max);
    }
}
