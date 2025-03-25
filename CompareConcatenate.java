import java.util.*;

public class CompareConcatenate {
    //main method
    public static void main(String[] args) {
        String str ="hello"; //string
        // Compare StringBuffer
        long startBuffer = System.nanoTime();
        concatenateBuffer(str);
        long endBuffer = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ns");

        // Compare StringBuilder
        long startBuilder = System.nanoTime();
        concatenateBuilder(str);
        long endBuilder = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ns");
    }
    //method to concatenate
    public static void concatenateBuffer(String str){
        StringBuffer sb1 =new StringBuffer(); //string buffer
        for(int i=0;i<10000;i++){
            sb1.append(str);
        }
    }

    public static void concatenateBuilder(String str){
        StringBuilder sb2 =new StringBuilder(); //string buffer
        for(int i=0;i<10000;i++){
            sb2.append(str);
        }
    }
}
