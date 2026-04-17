package String;

public class FrequencyOfString {
    public static void main(String[] args) {
        
        String str="hello";
        str=str.toLowerCase();

        for(char ch='a';ch<='z';ch++){
            int count=0;

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            
            if(count>0){
                System.out.println(ch+" "+count);
            }
        }
    }
}
