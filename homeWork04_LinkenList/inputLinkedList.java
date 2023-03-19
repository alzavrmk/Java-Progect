/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод(не void), который вернет “перевернутый” список.  */
package homeWork04_LinkenList;

import java.util.LinkedList;

public class inputLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.add(0, 0);
        myList.add(1, 1);

        for (int index = 2; index < 10; index++) {
            myList.add(myList.get(index-2)+myList.get(index-1));

        }
        System.out.println("Десять элементов ряда Фибоначчи.");
        System.out.println(myList);
        System.out.println("Десять элементов ряда Фибоначчи в обратном порядке.");
        System.out.println(reverseLinkedList(myList));
    }
    
    static LinkedList<Integer> reverseLinkedList (LinkedList<Integer> list){
        LinkedList<Integer> myList = new LinkedList<Integer>();
        for (Integer iterable_element : list) {
            myList.add(0, iterable_element);
        }
        return myList;
    }
}
