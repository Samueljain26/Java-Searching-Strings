import java.util.*;

public class Concatenate {
    //main method
    public static void main(String[] args) {
        String[] arr = {"I","am","placed","in","Capgemini"}; //strings array
        concatenate(arr);
    }
    //method to concatenate
    public static void concatenate(String[] arr){
        StringBuffer sb =new StringBuffer(); //string buffer
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
