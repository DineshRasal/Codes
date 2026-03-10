package Array;

public class SmallestEle {

    public static void main(String[] args) {

        int arr[]={3,5,9,8,15,1};

    int min=arr[0];
    int max=arr[0];

    for(int i=1; i<arr.length;i++){
        if (arr[i]<min){
            min=arr[i];
        } 
    }
     for(int i=1; i<arr.length;i++){
        if (arr[i]>min){
            max=arr[i];
        } 
    }

    System.out.println("Smallest Value in Array:"+min+"  Largest Value In Array:"+max);
        }
    
}
