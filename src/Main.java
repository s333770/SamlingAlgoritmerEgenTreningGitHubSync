import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {


    private int[] theArray=new int[50];
    private int arraySize=10;
    public void generateRandomArray(){
        for(int i=0;i<arraySize;i++){
            theArray[i]=(int)(Math.random()*20);
        }
    }
    public void printHorizontalArray(){
        for (int i=0; i<arraySize; i++){
            System.out.printf("%5s",i);
        }
        System.out.println();
        for(int i=0;i<arraySize;i++){
            System.out.printf("%5s",theArray[i]);
        }
    }





    public static void main(String[] args) {
        Main main=new Main();
        main.generateRandomArray();
        //main.printHorizontalArray();
        int []array1={10, 80, 30, 90, 40, 50};
        System.out.println();
        Algoritmer.quickSort(array1,0,5);
        System.out.println(Arrays.toString(array1));
        Algoritmer.binarySearch(array1,80,0,5);


    }
}







