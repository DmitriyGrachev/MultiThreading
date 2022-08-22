package ThreeArraysIntoFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionFile {
    public static void main(String[] args){

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 12};
        int[] array3 = {13, 14, 15, 16, 17, 18};
        int[] array4 = {19, 20, 21, 22, 23, 24};
        int[] array5 = {25, 26, 27, 28, 29, 30};
        //Create list of arrays
        List<int[]> fiveArrays = new ArrayList<>();
        fiveArrays.add(array1);
        fiveArrays.add(array2);
        fiveArrays.add(array3);
        fiveArrays.add(array4);
        fiveArrays.add(array5);

        for (int i = 1; i < fiveArrays.size(); i++) {
            SaveAsThread saveAsThread = new SaveAsThread( "Поток : " + i  ,fiveArrays.get(i-1));
            //create thread of each "i" savaThread and start it
            Thread thread = new Thread(saveAsThread);
            thread.start();
        }
    }

}
