
package Interview;
public class PR {
    
    //Print Number Of Occurance of word

    public static void main(String[] args) {
        
        String[] arr={"Critical","Verbal","Partial","Critical"};   

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Critical")){
                count++;
            }
        }
        System.out.println(count);
    }
}
