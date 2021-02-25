package chapter3.bubblesort;

public class BubbleSort {

  private int nElems;
  private int maxSize;
  private int[] array;

  public BubbleSort(int maxSize) {
    this.maxSize = maxSize;
    this.array = new int[maxSize];
    this.nElems = 0;
  }

  public int[] sort() {
//    for (int i = 0; i < array.length - 1; i++) {
//      for (int j = i + 1; j < array.length; j++) {
//        if (array[i] > array[j]) {
//          swap(i, j);
//        }
//      }
//    }

//    for (int out = nElems - 1; out > 1; out--) { Error in book out > 1
    for (int out = nElems - 1; out > 0; out--) {
      for (int in = 0; in < out; in++) {
        if (array[in] > array[in + 1]) {
          swap(in, in + 1);
        }
      }
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
    int maxSize = 130_000; //Sort total time ms=5908
    BubbleSort bubbleSort = new BubbleSort(maxSize);

    for (int j = maxSize - 1; j >= 0; j--) // Заполнение массива
    {
      bubbleSort.insert(j);
    }

    System.out.println("Before sorting");
    bubbleSort.display();

    long startTime = System.currentTimeMillis();

    bubbleSort.sort();

    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println("After sorting");
    bubbleSort.display();
    System.out.println("Sort total time ms=" + totalTime);
  }

  private static void sortRandomElements() {
    //10_000 - 102 ms
    //100_000 - 17000ms
    //180_000 - 57917ms
    //130_000 - 29306ms
    int maxSize = 130_000;
    BubbleSort bubbleSort = new BubbleSort(maxSize);

    for(int j=0; j<maxSize; j++) // Заполнение массива
    { // случайными числами
      int n = (int)( Math.random()*(maxSize-1) );
      bubbleSort.insert(n);
    }

    System.out.println("Before sorting");
    bubbleSort.display();

    long startTime = System.currentTimeMillis();

    bubbleSort.sort();

    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println("After sorting");
    bubbleSort.display();
    System.out.println("Sort total time ms=" + totalTime);
  }
}
