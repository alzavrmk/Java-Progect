package homework05;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;


public class countName {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String str;
        Map <String, String> famalyName = new HashMap <> ();
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
            famalyName.put(str.split(" ")[0], str.split(" ")[1] );
        }
        br.close();
    }
}
