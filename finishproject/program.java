package finishproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
    

        Map<String, String> notebook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Scanner scTitle = new Scanner(System.in);
        Scanner scOs = new Scanner(System.in);
        Scanner scColor = new Scanner(System.in);


        int num = 0; 
        int numMenu = 0;
        String strtitle = null;
        String strOs = null;
        String strColor = null;
        String os = null;

        while (true) {
            try {
                System.out.println("1- добавить ноутбук,\n2 - вывод всего, \n3 - закончить ввод");
                numMenu = sc.nextInt();          

            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
            if (numMenu == 1){
                try {
                System.out.println("Название ноутбука: ");
                strtitle = scTitle.nextLine();
                System.out.println("Операционная система: ");
                strOs = scOs.nextLine();
                System.out.println("Цвет: ");
                strColor = scColor.nextLine();
                NooteBook1 n1 = new NooteBook1(strtitle,strOs,strColor);
                System.out.println("Объем оперативной памяти: ");
                n1.setramValue(sc.nextInt()); 
                System.out.println("Объем жесткого диска: ");
                n1.sethddValue(sc.nextInt()); 
                notebook.put(strtitle, strOs+", "+strColor+", "+ n1.ramValue + n1.hddValue);
            
                } catch (Exception e) {
                    System.out.println("Ошибка ввода");
                }
                
                
            } else 
                if(numMenu == 2){
                System.out.println(notebook);
                }
                else { if (numMenu == 3) {
                    break;
                } else{
                    System.out.println("Неверный ввод");
                }
                    
                }
        

        }
        scTitle.close();
        scOs.close();
        scColor.close();
        sc.close();
    }
}
