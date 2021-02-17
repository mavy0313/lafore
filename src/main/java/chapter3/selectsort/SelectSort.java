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
    int out, in, min;
    for (out = 0; out < nElems - 1; out++) {
      min = out;
      for (in = out + 1; in < nElems; in++) {
        if (array[in] < array[min]) {
          min = in;
        }
        swap(out, min);
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
