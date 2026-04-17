package String;

public class RemoveSpacesString {
    public static void main(String[] args) {
        
        String str="Hello World";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==' '){

            }else{
                System.out.print(ch);
            }

        }
    }
}
