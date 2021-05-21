package chapter3.insertsort;

public class InsertSort {
  private int nElems;
  private int maxSize;
  private int[] array;

  public InsertSort(int maxSize) {
    this.maxSize = maxSize;
    this.array = new int[maxSize];
    this.nElems = 0;
  }

  public int[] getArray() {
    int[] result = new int[nElems];
    for (int i = 0; i < nElems; i++) {
      result[i] = array[i];
    }
    return result;
  }

  public int[] sort() {
    int out, in;
    for (out = 1; out < nElems; out++) {
      int temp = array[out];
      in = out;
      while (in > 0 && array[in - 1] >= temp) {
        array[in] = array[in -1];
        --in;
      }
      array[in] = temp;
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
    int maxSize = 130_000; //Sort total time ms=2863
    InsertSort insertSort = new InsertSort(maxSize);

    for (int j = maxSize - 1; j >= 0; j--) // Заполнение массива
    {
      insertSort.insert(j);
    }

    System.out.println("Before sorting");
    insertSort.display();

    long startTime = System.currentTimeMillis();

    insertSort.sort();

    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println("After sorting");
    insertSort.display();
    System.out.println("Sort total time ms=" + totalTime);
  }

  private static void sortRandomElements() {
    //10_000 - 102 ms
    //100_000 - 17000ms
    //180_000 - 57917ms
    //130_000 - 29306ms bubble sort

    //130_000 - 31771ms select sort
    //130_000 - 1664ms insert sort

    int maxSize = 130_000;
    InsertSort insertSort = new InsertSort(maxSize);

    for(int j=0; j<maxSize; j++) // Заполнение массива
    { // случайными числами
      int n = (int)( Math.random()*(maxSize-1) );
      insertSort.insert(n);
    }

    System.out.println("Before sorting");
    insertSort.display();

    long startTime = System.currentTimeMillis();

    insertSort.sort();

    long endTime = System.currentTimeMillis();

    long totalTime = endTime - startTime;
    System.out.println("After sorting");
    insertSort.display();
    System.out.println("Sort total time ms=" + totalTime);
  }

  public int median() {
    sort();
    return array[array.length / 2];
  }

  public void noDups() {
    int toDeleteCount = 0;
    for (int i = 0, j = 1; j < nElems; j++) {
      if (array[i] == array[j]) {
        toDeleteCount++;
      } else {
        i++;
        array[i] = array[j];
      }
    }
    nElems -= toDeleteCount;
  }
}
