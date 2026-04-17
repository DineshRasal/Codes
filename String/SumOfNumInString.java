package String;

public class SumOfNumInString {
    public static void main(String[] args) {
        
        String str="He24ll67oo";
        int sum=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='0' && ch<='9'){
                int num=ch-'0';

                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
