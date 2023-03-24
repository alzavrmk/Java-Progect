/* */
package homework05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phonBook {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Scanner scstr = new Scanner(System.in);
        int numMenu = 0;
        String strfamily = null;
        String numberPhone = null;
        while (true) {
            try {
                System.out.println("1- добавление номера,\n2 - вывод всего, \n3 - закончить ввод");
                numMenu = sc.nextInt();          

            } catch (Exception e) {
                System.out.println("Ошибка ввода");// TODO: handle exception
            }
            if (numMenu == 1){
                try {
                    System.out.println("Фамилия:");
                strfamily = scstr.nextLine();
                System.out.println("Номер:");
                numberPhone = scstr.nextLine(); 
                } catch (Exception e) {
                    System.out.println("Ошибка ввода");// TODO: handle exception
                }
                System.out.println("Фамилия:");
                strfamily = scstr.nextLine();
                System.out.println("Номер:");
                numberPhone = scstr.nextLine();
                people.put(strfamily, people.get(strfamily)+", "+numberPhone);
            } else 
                if(numMenu == 2){
                System.out.println(people);
                }
                else { if (numMenu == 3) {
                    break;
                } else{
                    System.out.println("Неверный ввод");
                }
                    
                }

        }
    }
}
