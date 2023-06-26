import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       
        Phon_book.sortedPrint(null);   // Task1
        // HeapSort.askValues(args); // Task2 

    }
  // Инициализация начального списка
        Map<String, ArrayList> abon = new HashMap<>() {
            {
                put("Иванов", new ArrayList<Integer>() {
                    {
                        add(996787);
                        add(558876);
                        add(352381);
                    }
                });

                put("Иванов", new ArrayList<Integer>() {
                    {
                        add(564277);
                        add(956162);
                        add(894655);
                    }
                });
                put("Сидоров", new ArrayList<Integer>() {
                    {
                        add(653123);
                    }
                });
                put("Петров", new ArrayList<Integer>() {
                    {
                        add(585383);
                        add(621377);

                    }
                });
                put("Васечкин", new ArrayList<Integer>() {
                    {
                        add(852644);
                        add(624222);
                        add(756512);
                        add(456875);
                    }
                });
            }
        };
        System.out.println();
        // Печатаем исходный набор данных
        System.out.println("Исходные данные: ");
        sortedPrint(abon);

        // Создаем циклическое меню
        Scanner scan = new Scanner(System.in, "cp866");
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("Введите номер действия (1 - добавить абонента, 9 - выйти из программы):");
            st = scan.nextLine();
            String name = "";
            String phString;
            switch (st) {
                case "1": {
                    System.out.println("Введите фамилию абонента:");
                    name = scan.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Проверьте данные, фамилия уже есть");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номера телефонов через запятую: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(",");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item: arr) {
                            arrInt.add(Integer.parseInt(item.trim())) ;
                        }
                        abon.put(name, arrInt);
                        System.out.println();
                        sortedPrint(abon);
                        break;
                    }
                }
                case "9": {
                    getOut = true;
                    System.out.println();
                    System.out.println("Goodbay");
                    System.out.println();
                    break;
                }   
                    
               
            }
        }
    }
}
