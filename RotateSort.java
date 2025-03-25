import java.util.Scanner;

public class RotateSort {

    static  int findRotation(int [] arr){
        int l=0,r=arr.length-1;

        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]>arr[r]){
                l=m+1;
            }
            else{
                r=m;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of the array");

        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter Array elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int rotationPoint=findRotation(arr);

        System.out.println(rotationPoint);

    }
}
/*Enter size of the array
5
Enter Array elements
4
5
1
2
3
2
 */