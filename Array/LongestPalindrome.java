package Array;

public class LongestPalindrome {
    public static void main(String[] args) {

        int arr[] = {121, 345, 787, 454, 12, 99};
        int maxPalindrome = -1;

        for(int i = 0; i < arr.length; i++){
            
            int num = arr[i];
            int original = num;
            int rev = 0;

            // Reverse number
            while(num > 0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            // Check palindrome
            if(original == rev && original > maxPalindrome){
                maxPalindrome = original;
            }
        }

        if(maxPalindrome != -1){
            System.out.println("Longest Palindrome: " + maxPalindrome);
        } else {
            System.out.println("No Palindrome Found");
        }
    }
}