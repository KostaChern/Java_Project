//  Реализовать алгоритм пирамидальной сортировки (HeapSort)
// (найти метод в Интернете и включить в проект)

public class HeapSort {
    public static void askValues(String[] args) {
    int[] arr = {11,28,0,35,456,75,965,415,555,457,5,54,56,875,-4,-123,456,75,-95};

    heapSort(arr);

    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

  /**
   * создаем дерево массива и берем его длину
   * @param arr
   */
  public static void heapSort(int[] arr) {
    int n = arr.length;

    //создаём дерево, построение кучи (перегруппируем массив)
    for(int i  = n / 2 - 1; i >= 0; i--)
      heapiTree(arr, i , n);

    //Делаем сортировку массива, уже отсортированного дерева,
    
    for (int i = n - 1; i >= 0; i--){

      // Перемещаем текущий корень в конец
      int temp = arr[i];
      arr[i] = arr[0];
      arr[0] = temp;

      // Вызываем процедуру heapiTree на уменьшенной куче
      heapiTree(arr, 0, i);
    }

  }

  /**
   * метод в котором родитель будет максимальным элементом по сравнению
   * со своими производными в дереве
   * @param arr
   * @param i
   * @param n
   */
  private static void heapiTree(int[] arr, int i, int n) {
    //левая производная
    int l = i * 2 + 1;

    //правая производная
    int r = i * 2 + 2;

    //Инициализируем наибольший элемент как корень
    int searchLargestValue = i;

    //Проверка чтоб производные не стали больше чем родители
    я
    if(l < n && arr[l] > arr[searchLargestValue])
      searchLargestValue = l;
    if(r < n && arr[r] > arr[searchLargestValue])
      searchLargestValue = r;

    //Если, производная больше родителя, то делаем обмен,
    //производной с родителем. Если самый большой элемент не корень
    if (i != searchLargestValue){
      int temp = arr[i];
      arr[i] = arr[searchLargestValue];
      arr[searchLargestValue] = temp;

     
      //повторная проверка, если вдруг у производныъ есть свои производные,
      //рекурсивно преобразуем в двоичную кучу 
      heapiTree(arr, searchLargestValue, n);
    }
  }             
}
