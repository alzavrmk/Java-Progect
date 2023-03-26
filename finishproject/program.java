package finishproject;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        NooteBook1 nb = new  NooteBook1();
        List<NooteBook1> nbList= new ArrayList<>();

        
        nbList.add(nb.add("Hp","Win10","black", 8, 512,18000));
        nbList.add(nb.add("Asus","Linux","Gray", 16, 250, 60000));
        nbList.add(nb.add("Honor","None OC","black", 8, 120, 40000));
        nbList.add(nb.add("Huawei","Win11","black", 16, 250, 80000));
        System.out.println(nbList);

        Scanner sc = new Scanner(System.in);
/* 
        
        
        Scanner scTitle = new Scanner(System.in);
        Scanner scOs = new Scanner(System.in);
        Scanner scColor = new Scanner(System.in);


        int num = 0; 
        
        String strtitle = null;
        String strOs = null;
        String strColor = null;
        String os = null;
*/
        int numMenu = 0;
        Set<Integer> ramval = new HashSet<Integer>();

        while (true) {
            try {
                System.out.println("1- ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n 4 - Цвет\n 5- выход");
                numMenu = sc.nextInt();          

            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
            if (numMenu == 1){
                for (NooteBook1 nb1: nbList) {
                    ramval.add(nb1.getramValue()); 
                    //System.out.println(ramval);   

                }
            System.out.println(ramval);
            }
            else { if (numMenu == 5) {
                    break;}}
            
   /*             try (FileWriter fw = new FileWriter("file.txt", true)){
                
                fw.append("nn");
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
                fw.append(strtitle+", "+strOs+", "+strColor+", "+ n1.ramValue + n1.hddValue);
            
                } catch (Exception e) {
                    System.out.println("Ошибка ввода");
                }

            } else 
                if(numMenu == 2){
                System.out.println(notebook);
                }
                
                } else{
                    System.out.println("Неверный ввод");
                }
                    
                }
        }
        scTitle.close();
        scOs.close();
        scColor.close();
        

*/ 
    }
    sc.close();
}
}

