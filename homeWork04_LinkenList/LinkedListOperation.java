/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
package homeWork04_LinkenList;

import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<Integer> listNum = new LinkedList<Integer>();
        for (int index = 0; index < 10; index++) {
            listNum.add(index);
        }
        System.out.println(listNum);
        enqueue(listNum, 43);
        System.out.println("Первый элемент очереди:"+dequeue(listNum));
        System.out.println(listNum);
        System.out.println("Первый элемент очереди: "+first(listNum));
        System.out.println(listNum);
    }
    static void enqueue(LinkedList<Integer> list, Integer elem) {
        list.addLast(elem);
    }
    static int dequeue (LinkedList<Integer> list) {
        int n = 0;
        if (list.size() !=0){
            n = list.get(0);
            list.pollFirst();
        }
        return n;
    }
    static int first(LinkedList<Integer> list) {
        int k = 0;
        if (list.size() !=0) {
            k = list.get(0);
        }
        return k;
    }
}
