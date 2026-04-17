package String;

public class RemoveVowel {
    
    public static void main(String[] args) {
        
        String str="HelloBhai";
         int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
             || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){


             }else{
                
                System.out.println(ch);
                count++;
             }
            
        }
         System.out.println("After Removing Vowel From String Count:"+count);
       
    }
}
