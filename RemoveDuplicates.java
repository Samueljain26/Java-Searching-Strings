import java.util.*;

class RemoveDuplicates {
    //method to remove duplicates
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder(); //string builder
        HashSet<Character> seen = new HashSet<>(); //hash map

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original String: " + input);
        System.out.println("Without Duplicates: " + removeDuplicates(input));
    }
}
/*Original String: programming
Without Duplicates: progamin
 */