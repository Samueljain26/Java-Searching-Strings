import java.util.*;

public class ReverseString {
    //main method
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello"); //stringbuilder
        System.out.println("String: "+ sb);
        reverseString(sb); //calling the method

    }
    //method to reverse string
    public static void reverseString(StringBuilder sb){
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i;
            char frontChar =sb.charAt(front);
            char backChar =sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        //display output
        System.out.println("Reverse String: " + sb);

    }
}
/*String: Hello
Reverse String: olleH
 */