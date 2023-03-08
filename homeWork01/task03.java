/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */
package homeWork01;

import java.util.Scanner;

public class task03 {
    public static void main (String[] args){
        float num1 = 0, num2 = 0;
        String operation = "";
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        Scanner scOper = new Scanner(System.in);
        try {
            System.out.println("Ввод числа:");
            num1 = sc.nextFloat();
            System.out.println("Ввод знака:");
            operation = scOper.nextLine();
            ch = operation.charAt(0);
            System.out.println("Ввод числа:");
            num2 = sc.nextFloat();
        } catch (Exception e) {
            System.out.println(e.getMessage());// TODO: handle exception
        }
        float r = 0;
        switch (ch) {
            case '+':
                r= num1 + num2;
                break;
            case '-':
                r= num1 - num2;
                break;
            case '*':
                r= num1 * num2;
                break;   
            case '/':
                if (num2 != 0) {
                    r = num1 / num2;
                }
                else {
                    System.out.println("Деление на ноль!");
                }
                break;
            default:
                System.out.println("Неверно введена операция!");
        }
        if ((ch == '/')|| (ch == '*') ||(ch == '+') || (ch == '-')){
            System.out.printf("%.2f %s %.2f = %.2f \n",num1, ch, num2, r);
        }
    sc.close();
    scOper.close();
    }
}
