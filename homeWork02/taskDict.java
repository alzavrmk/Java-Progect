/*Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/
package homeWork02;

import java.io.BufferedReader;
import java.io.FileReader;

public class taskDict {
    public static void main (String[] args)throws Exception {
        //Map<String, String> myDir = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            //str =br.readLine();
            MyParse(str);
        }
    }
    public static void MyParse(String str) {
        StringBuilder outStr = new StringBuilder();
        outStr.append("Студент(ка) ").append(str.split(",")[0].split(":")[1]).append(" получил(а) ")
        .append(str.split(",")[1].split(":")[1]).append(" по предмету ")
        .append(str.split(",")[2].split(":")[1]).append(".");
        System.out.println(outStr);
    }
}
