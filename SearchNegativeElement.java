import java.util.Scanner;

public class SearchNegativeElement {

    static int findFirstNeagativeElement(int [] arr){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] arr=new int[10];
        System.out.println("Enter 10 elements ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        int element= findFirstNeagativeElement(arr);

        if(element<0){
            System.out.println("No negative element found");
        }
        else{
            System.out.println("first negative element is "+arr[element]);
        }

    }
}
/*Enter 10 elements
1 2 5 -9 -7 6 9 -9 7 -12
first negative element is -9
 */