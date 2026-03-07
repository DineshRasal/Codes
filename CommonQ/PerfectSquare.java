package CommonQ;

public class PerfectSquare {
    public static void main(String[] args) {
        
        int num=65;

        if(num>=0){
            int squareroot=(int) Math.sqrt(num);
            if (squareroot*squareroot==num) {
                System.out.println("The Number "+num+ " is  Perfect Squareroot");

            }
            else{
                System.out.println("The Number "+num+ " is Not Perfect Squareroot");
            }
        }
    }
}
