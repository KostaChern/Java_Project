/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */
import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {
// создаем список, в который добавляем все элементы коллекции LinkedList
    public static void revers_arr(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverse(myList));
    }
// метод, возращающий перевернутый список
    public static LinkedList<Integer> reverse(LinkedList<Integer> myList) {
        LinkedList<Integer> reversList = new LinkedList<>();
        for(int i=myList.size()-1;i>=0;i--){
            reversList.add(myList.get(i));
        }
        return reversList;

        
    } 

        
}        

