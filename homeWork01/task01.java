//Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
//а так же n! (произведение чисел от 1 до n)
package homeWork01;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        int n = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите натуральное число: ");
        n = iScanner.nextInt();
        int factorial = 1;
        int treangleNum = 0;
        for (int i = 1; i <= n; i++) {
            treangleNum +=i;
            factorial *=i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна %d \n",n, treangleNum);
        System.out.printf("Произведение чисел от 1 до %d равно %d",n, factorial);
        iScanner.close();
    }
}
