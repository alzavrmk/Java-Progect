/*Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
результат после каждой итерации запишите в лог-файл. */
package homeWork02;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
//import java.lang.System.Logger;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class taskSort {
    public static void main(String[] args)throws IOException {
        Logger ll = Logger.getLogger(taskSort.class.getName());
        String logsPath = "lod.txt";
        FileHandler fh= new FileHandler(logsPath, false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        int[] array = new int [] {1, 2, 5, 3, 8 , 7, 6, 9};
        String s="";
        int k = 0;
        int n = array.length;
        System.out.println();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (array[j]<array[j+1]) {
                    k = array [j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                }
            s = arrToString(array);
            System.out.println(s);
            addStringlogFile(ll,s);
            }
        }
    }
    static String arrToString(int arr[]) {
        String str = "";
        for (int index = 0; index < arr.length; index++) {
            str = str+ arr[index];
        }
        return str;
        
    }
    static void addStringlogFile(Logger lg, String str) {
        lg.log(Level.INFO, str);
    }
    // static void addStringInFile(String str) {
    //     try (
    //         FileWriter fw = new FileWriter("file.txt", true)) {
    //         fw.write(str + '\n');
    //         fw.close();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }
}
