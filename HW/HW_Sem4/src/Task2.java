import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
  Реализуйте очередь с помощью LinkedList со следующими методами:
  enqueue() - помещает элемент в конец очереди, 
  dequeue() - возвращает первый элемент из очереди и удаляет его, 
  first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Task2 {
 //метод раюоты с LinkedList
    public static void workWithLinkedList(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число:");
        enqueue(ls, sc.nextInt());
        //вывод на печать
        System.out.println(ls);
        System.out.println(dequeue(ls));
        System.out.println(ls);
        System.out.println(first(ls));
        System.out.println(ls);
        sc.close(); //закрытие программы
    }    
    public static void enqueue(LinkedList<Integer> ls, int element){
        ls.add(element);//помещает элемент в конец очереди
    }
    public static int dequeue(LinkedList<Integer> ls){
        int a = ls.getFirst(); //возвращает первый элемент из очереди
        ls.removeFirst(); //удаляет первый элемент
        return a;

    }
    public static int first(LinkedList<Integer> ls){
        return ls.getFirst();  //возвращает первый элемент из очереди, не удаляя.
    }
}            

