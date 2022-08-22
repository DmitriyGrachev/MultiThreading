package ArrayTaskMaxMin;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionArray {
        public static void main(String[] args) {
            //Сканнера для ввода с клавиатуры
            Scanner scanner = new Scanner(System.in);
            //create a array of numbers
            int[] num = new int[5];
            System.out.println("Введите числа массива");
            for(int i = 0; i<num.length; i++){
                //Parse String line to Integer
                int input = Integer.parseInt(scanner.nextLine());
                num[i] = input;

            }

            System.out.println("Массив : ");
            //Output the array
            System.out.println(Arrays.toString(num));
            //Max and min elements of array
            MaxArrayThread maxThread = new MaxArrayThread(num);
            MinArrayThread minThread = new MinArrayThread(num);
            Thread maxThreadToFind = new Thread(maxThread);
            Thread minThreadToFind = new Thread(minThread);
            maxThreadToFind.start();
            minThreadToFind.start();
        }
}
