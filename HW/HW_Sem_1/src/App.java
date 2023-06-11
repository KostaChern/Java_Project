public class App {
    public static void main(String[] args) throws Exception {

        // Дорабатываем не доделанные задачи на семинаре:
        task_5();
        task_8();

    }

    // Дан массив, нужно найти такой элемент массива i, чтобы сумма элеменов справа
    // от i
    // была равна сумме элементов слева

    private static void task_8() {
        int[] num = {1, 7, 3, 6, 5, 6};
        System.out.println(meanIndex(num));
    }

    private static int meanIndex(int[] num) {
        int index = 1;
        while(lowSum(num,index)<hihgSum(num,index))
        {
            index++;
        }
        if(lowSum(num,index)==hihgSum(num, index))
        {
            return index;
        }
        else
        {
            return -1;
        }
    }
    private static int hihgSum(int[] num, int index) {
        int sum = 0;
        for (int i = num.length - 1; i > index; i--)
        {
            sum += num[i];
        }
        return sum;
    }

    private static int lowSum(int[] num, int index) {

        int sum = 0;
        for (int i=0; i<index; i++) 
        {
            sum+=num[i];
        }
        return sum;
    }

    //     int sum = 0;
    
    // Дана строка, нужно переставить слова в обратном порядке
private static void task_5() {
    String sourceln = "Welcome To Java Course";
       String[] splitln = sourceln.split(" ");
       String outln = "";
       for(int i = splitln.length-1; i>=0; i--)
       {
            outln = outln+splitln[i]+" ";
       }
       System.out.println(sourceln);
       System.out.println(outln);
    }
