public class App {
    public static void main(String[] args) throws Exception {
        // task1.execute();
        // task2();
          Task4.writeTestToFile(100);          
    }

    private static void task2(){
int[] mass = { 1, 1, 0, 3, 1, 3, 0, 1, 0, 3 };
int val = 3;

for (int i = 0; i < mass.length; i++) {
    if (mass[i] == val) {
        for (int[j] = i; j < mass.length - 1; j++)
            mass[j] = mass[j+1];
            mass[mass.length-1] = val;               
    }
}
for (int item : mass)
    System.out.printf(format:"%d\t", item);

}

}

