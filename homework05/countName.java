package homework05;
import java.util.Map;

//import homeWork03.ArrList;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
public class countName {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String str;
        Map <String, Integer> famalyName = new HashMap <> ();
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
            String strkey =str.split(" ")[0];
            if (famalyName.containsKey(strkey)) {
                famalyName.put(strkey, famalyName.get(strkey)+1 );
            } else {
                famalyName.put(strkey, 1 );
            }
        }
        System.out.println(famalyName);
        br.close();
    }
}
