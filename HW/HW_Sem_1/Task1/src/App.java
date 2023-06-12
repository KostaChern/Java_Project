import java.util.Scanner;

public class App {
    /**
 * task1
 * Вычислить сумму чисел от 1 до n
 */

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int i = iScanner.nextInt();
        System.out.printf("Сумма чисел от 1 до N: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
    
