package String;

import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter Any String");
       String s1=sc.nextLine();
       
       System.out.println("Enter old Word to replace");
       String oldWord=sc.nextLine();

        System.out.println("Enter new Word to replace");
       String newWord=sc.nextLine();

       s1=s1.replace(oldWord, newWord);

       System.out.println(s1);

    }
}
