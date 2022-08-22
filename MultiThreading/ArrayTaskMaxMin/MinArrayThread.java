package ArrayTaskMaxMin;
import java.util.Arrays;

public class MinArrayThread implements Runnable {
    private final int[] arr;
    private Integer min = 0;
    //constructors
    public MinArrayThread(){
        this.arr = null;
    }
    public MinArrayThread(int[] numbers){
        this.arr = numbers;
    }

    @Override
    public void run() {

        min = arr[0];
        for (int i = 0; i <= arr.length-1;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Найменший елемент массива : "  + min);

    }
}

