package String;

public class LengthOfString {
    public static void main(String[] args) {
        
        String str="HEllo Bhai";
        int count=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){

            }else{
                 count++;
            }
           
        }
        System.out.println(count);
    }
}
