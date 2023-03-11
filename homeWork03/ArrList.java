//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
package homeWork03;
import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int index = 0; index < 3; index++) {
            numList.add((int) (Math.random()*10));
        }
        System.out.println(numList);
        int num = maxListArr(numList);
        System.out.println("Максимальное значение равно: "+num);
        num = minListArr(numList);
        System.out.println("Минимальное значение равно: "+num);
        double d = everArifmListArr(numList);
        System.out.printf("Среднее арифметическое равно: %.2f ",d);
    }
    static int maxListArr(ArrayList<Integer> myList) {
        int num = myList.get(0);
        for (int index = 1; index < myList.size(); index++) {
            if (myList.get(index)>num){
                num = myList.get(index);
            }
        }
        return num;
    }
    static int minListArr(ArrayList<Integer> myList) {
        int num = myList.get(0);
        for (int index = 1; index < myList.size(); index++) {
            if (myList.get(index)<num){
                num = myList.get(index);
            }
        }
        return num;
    }
    static double everArifmListArr(ArrayList<Integer> myList) {
        int sum = 0;
        for (int index = 1; index < myList.size(); index++) {
            sum += myList.get(index);
        }
        System.out.println(sum);
        System.out.println(myList.size());
        return (double) sum/ (double) myList.size();
    }
}
