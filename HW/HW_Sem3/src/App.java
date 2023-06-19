import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
        // GoTask1();
        //  Task2.DelEvenNumbers(args);
        Task3.minAveregeMax(args);
    }
    private static void GoTask1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Заполните массив через пробел: ");
        String rawInput = input.nextLine();
        String[] array = rawInput.split(" ");
        int[] original = new int[array.length];
        for (int i = 0; i < original.length; i++)
            original[i] = (Integer.parseInt(array[i]));
        Task1.print(original, "Начальный массив:");
        Task1.Metod(original);
        Task1.print(original, "Отсортированный массив:");
    }
}
