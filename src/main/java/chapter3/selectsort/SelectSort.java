package chapter3.selectsort;

public class SelectSort {

  private int nElems;
  private int maxSize;
  private int[] array;

  public SelectSort(int maxSize) {
    this.maxSize = maxSize;
    this.array = new int[maxSize];
    this.nElems = 0;
  }

  public int[] sort() {
//    int out, in, min;
//    for (out = 0; out < nElems - 1; out++) {
//      min = out;
//      for (in = out + 1; in < nElems; in++) {
//        if (array[in] < array[min]) {
//          min = in;
//        }
//        swap(out, min);
//      }
//    }

    int out, in, min;
    for (out = 0; out < nElems - 1; out++) {
      min = out;
      for (in = out + 1; in < nElems; in++) {
        if (array[in] < array[min]) {
          min = in;
        }
      }
      swap(min, out);
    }
    return array;
  }

  private void swap(int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  public void insert(int i) {
    array[nElems++] = i;
  }

  public void display() // Вывод содержимого массива
  {
    for(int j=0; j<nElems; j++) // Для каждого элемента
      System.out.print(array[j] + " "); // Вывод
    System.out.println("");
  }

  public static void main(String[] args) {
    sortRandomElements();
    sortDescOrderedElements();
  }

  private static void sortDescOrderedElements() {
    int maxSize = 130_000; //Sort total time ms=6427
    SelectSort selectSort = new SelectSort(maxSize);

    for (int j = maxSize - 1; j >= 0; j--) // Заполнение массива
    {
      selectSort.insert(j);
    }

    System.out.println("Before sorting");
    selectSort.display();

    long startTime = System.currentTimeMillis();

    selectSort.sort();

    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println("After sorting");
    selectSort.display();
    System.out.println("Sort total time ms=" + totalTime);
  }

  private static void sortRandomElements() {
    //10_000 - 102 ms
    //100_000 - 17000ms
    //180_000 - 57917ms
    //130_000 - 29306ms

    //130_000 - 31771
    int maxSize = 130_000;
    SelectSort selectSort = new SelectSort(maxSize);

    for(int j=0; j<maxSize; j++) // Заполнение массива
    { // случайными числами
      int n = (int)( Math.random()*(maxSize-1) );
      selectSort.insert(n);
    }

    System.out.println("Before sorting");
    selectSort.display();

    long startTime = System.currentTimeMillis();

    selectSort.sort();

    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println("After sorting");
    selectSort.display();
    System.out.println("Sort total time ms=" + totalTime);
  }
}
