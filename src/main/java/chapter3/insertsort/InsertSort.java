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
}
