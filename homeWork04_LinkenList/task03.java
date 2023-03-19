/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
В калькулятор добавьте возможность отменить последнюю операцию.
 */
package homeWork04_LinkenList;

import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.TreeUI;

public class task03 {
    public static void main(String[] args) {
        Stack<Float> stack = new Stack<Float>();
        float num1 = 0, num2 = 0;
        String operation = "";
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        Scanner scOper = new Scanner(System.in);
        Scanner scCancel = new Scanner(System.in);
        System.out.print("Ввод числа: ");
        num1 = sc.nextFloat();
        stack.push(num1);
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Ввод знака: ");
                operation = scOper.nextLine();
                ch = operation.charAt(0);
                System.out.print("Ввод числа: ");
                num2 = sc.nextFloat();
            } catch (Exception e) {
                System.out.println(e.getMessage());// TODO: handle exception
            }
            float r = 0;
            switch (ch) {
                case '+':
                    r = num1 + num2;
                    break;
                case '-':
                    r = num1 - num2;
                    break;
                case '*':
                    r = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        r = num1 / num2;
                    } else {
                        System.out.println("Деление на ноль!");
                    }
                    break;
                default:
                    System.out.println("Ошибка ввода!");
            }
            if ((ch == '/') || (ch == '*') || (ch == '+') || (ch == '-')) {
                System.out.printf("%.2f %s %.2f = %.2f \n", num1, ch, num2, r);
                stack.push(r);
                System.out.println(stack);
            }

            System.out.println("Введите 'cancel' чтобы отменить последнюю операцию;\n '+' чтобы продолжить; \n '-' закончить ввод");
            String  s = scCancel.nextLine();
            System.out.println(s);
            if (s.equals("cancel")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    num1 = stack.peek();
                    System.out.println(num1);
                    System.out.println(stack);
                }
            } else if (s.equals("-")) { 
                flag = false;
                }
                else {
                    num1 = stack.peek();
                }
                    
        }
    sc.close();
    scOper.close();
    scCancel.close();
    }
}

