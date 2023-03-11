//Пусть дан произвольный список целых чисел, удалить из него чётные числа
package homeWork03;

import java.util.ArrayList;

public class delEven {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int index = 0; index < 20; index++) {
            numList.add((int) (Math.random()*10));
        }
        System.out.println(numList);
        for (int i = numList.size()-1; i >=0; i--) {
            if (numList.get(i) % 2 ==0)
            numList.remove(i);
        }
        System.out.println(numList);
    }
}
