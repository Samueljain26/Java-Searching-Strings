import java.util.Scanner;

public class SearchWord {

    static void findWord(String str,String word){
        String [] arr=str.split(" ");

        for(String i:arr){
            if(i.equals(word)){
                System.out.println("Word found");
                return ;
            }
        }
        System.out.println("Word Not found ");
    }
    public static void main(String[] args) {
        System.out.println("Enter sentence ");
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        System.out.println("Enter the word you want to find");

        String word=sc.next();

        findWord(str,word);
        sc.close();
    }
}
/*Enter sentence
hello world
Enter the word you want to find
world
Word found
 */