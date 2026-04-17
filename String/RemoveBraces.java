package String;

public class RemoveBraces {
    
    public static void main(String[] args) {
        String str="a+(b-c)+d";

        String result=str.replaceAll("[(){}]", "");

        System.out.println(result); 

        // s.replaceAll("[a-zA-Z]", "");
        //👉 Remove letters → Hello123 → 123

        // s.replaceAll("[^a-zA-Z]", "");
        //👉 Keep only letters → Hello123 → Hello

    }
}
