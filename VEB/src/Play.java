import java.time.LocalTime;
import java.util.Scanner;

public class Play {
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        
        LocalTime timeOfDay = LocalTime.now();
        System.out.println(timeOfDay);
        if(timeOfDay.getHour()>18 && timeOfDay.getHour()<23)
        System.out.println("Добрый вечер, "+ name+"!");
        else if(timeOfDay.getHour()>23 && timeOfDay.getHour()<5)
        System.out.println("Доброй ночи, "+ name+"!");
        else if(timeOfDay.getHour()>5 && timeOfDay.getHour()<11)
        System.out.println("Доброе утро, "+ name+"!");
        else if(timeOfDay.getHour()>11 && timeOfDay.getHour()<18)
        System.out.println("Добрый день, "+ name+"!");

        System.out.println("Ваша задача угадать число");
        for (int i = 10; i <= 30; i += 10)
            playLevel(i);
        System.out.println(name+", это ПОБЕДА!!");
        scanner.close();
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        // System.out.println("число Х ="+number);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число ,больше");
            }

        }
    }
}
