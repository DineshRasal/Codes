package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String str1="listen";
        String str2="silent";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        // Convert to character Array

        char[] a1=str1.toCharArray();
        char[] a2=str2.toCharArray();

        // Sort the character array

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
