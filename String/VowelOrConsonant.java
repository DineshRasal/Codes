package String;

public class VowelOrConsonant {
    
    public static void main(String[] args) {
        
        // For CHARACTER
    //     char ch='e';

    //    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
    //             || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

    //         System.out.println(ch + " is Vowel");
    //     } 
    //     else {
    //         System.out.println(ch + " is Consonant");
    //     }


    // For STRING

        // String p="Hello Bhai";
        // int count=0;

        // for(int i=0;i<p.length();i++){
        //     char ch=p.charAt(i);

        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        //     || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

        //         count++;
        //         System.out.println("Vowel is Present = "+ch);
        //     }
        // }
        // System.out.println(count);
    


            // FOR ARRAY

            char arr[]={'a','b','c','d','e'};
            int count=0;

            for(int i=0;i<arr.length;i++){
                
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'
                || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){

                    count++;
                    System.out.println("Vowel is Present = "+arr[i]);
                }
            }
            System.out.println(count);
    }
}
    
