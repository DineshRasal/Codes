package Array;

public class FrequencyOfElementArray {
    public static void main(String[] args) {
        
        int[] arr={1,2,2,3,5,6};

        for(int i=0;i<arr.length;i++){
             int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            System.out.println(arr[i]+"Count is= "+count);
        }
    }
}
