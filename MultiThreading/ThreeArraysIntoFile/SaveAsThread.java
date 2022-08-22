package ThreeArraysIntoFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class SaveAsThread implements Runnable {
    //private fields
    private final String name;
    private final int[] num;
    //constructors
    public SaveAsThread(){
        this.name = "";
        this.num = null;
    }
    public SaveAsThread(String name, int[] arr){
        this.name = name;
        this.num = arr;
    }
    //method run
    @Override
    public void run() {

        File folder = new File("Stock/DirectoryForTask13/MultiThreading");
        File  fileStoreNumbers = new File("Stock/DirectoryForTask13/MultiThreading/numbers.txt");
        //no need for exception
        if(!folder.exists()){
            folder.mkdirs();
        }
        //catch exception
        if(!fileStoreNumbers.exists()){
            try {
                fileStoreNumbers.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //use fileWriter with try (fileWriter reates in try)
        try(FileWriter fileWriter = new FileWriter(fileStoreNumbers,true)){
            //use method tostring from Arrays
            fileWriter.write(Arrays.toString(this.num) + " : " + this.name + " \n");

        } catch (IOException e) {
            //output stach trace
            e.printStackTrace();
        }
    }

}
