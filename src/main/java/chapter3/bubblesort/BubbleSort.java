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
}
