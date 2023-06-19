// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public static void minAveregeMax(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<5;i++){
            arrlst.add(rnd.nextInt(0,8));
        }
        System.out.println(arrlst.toString());
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)>max) max = arrlst.get(i);
            if (arrlst.get(i)<min) min = arrlst.get(i);
            sum=sum+arrlst.get(i);
        }
        System.out.printf("Максимум: %d\n",max);
        System.out.printf("Минимум: %d\n",min);
        System.out.printf("Среднее: %.1f\n",((float)sum/arrlst.size()));


    }
}
