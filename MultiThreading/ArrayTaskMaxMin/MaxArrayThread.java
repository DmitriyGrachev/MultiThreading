package ArrayTaskMaxMin;
import java.util.Arrays;

public class MaxArrayThread implements Runnable {

    private final int[] arr;
    private Integer max = 0;
    //Constructors
    public MaxArrayThread(){
        this.arr = null;
    }
    public MaxArrayThread(int[] numbers){
        this.arr = numbers;
    }
    //method run
    @Override
    public void run() {
        //for each
        max = arr[0];
        for (int i : arr) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Найбольшее число в массиве : " + max);
    }
}

