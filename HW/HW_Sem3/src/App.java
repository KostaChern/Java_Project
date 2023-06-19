import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Введите элементы массива через пробел: ");
        String rawInput = input.nextLine();
        String[] array = rawInput.split(" ");
        int[] original = new int[array.length];
        for (int i = 0; i < original.length; i++)
            original[i] = (Integer.parseInt(array[i]));
        Task1.print(original, "Исходный массив:");
        Task1.Metod(original);
        Task1.print(original, "Отсортированный массив:");
        

    }
}
