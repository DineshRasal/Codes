package String;

public class CheckAlphabetOrNot {
    public static void main(String[] args) {
        
        char ch='9';

        if(ch>=96 && ch<=122 || ch>=65 && ch<=90){
            System.out.println("Charater Is Alphabet:"+ch);
        }else{
            System.out.println("Charater Is Not Alphabet:"+ch);
        }
    }
}
