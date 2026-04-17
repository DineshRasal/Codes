package Array;

import java.util.Arrays;

public class HalfAseDeacOrder {
    public static void main(String[] args) {
        
        int arr[] = {1,6,2,5,4,9};

        int n = arr.length;

        // First half → Ascending
        for(int i = 0; i < n/2; i++){
            for(int j = i+1; j < n/2; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];  // temp=1
                    arr[i] = arr[j];    //arr[i]=6
                    arr[j] = temp;      //arr[j]=1
                    
                }
            }
        }

        // Second half → Descending
        for(int i = n-1; i >= n/2; i--){
            for(int j = i-1; j >= n/2; j--){
                if(arr[i] > arr[j]){   // change condition
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print array
        System.out.println(Arrays.toString(arr));
    }
}