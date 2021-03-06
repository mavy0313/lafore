package chapter3.bubblesort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

  @Test
  public void shouldReturnSortedArray() {
    //given
    BubbleSort bubbleSort = new BubbleSort(4);
    bubbleSort.insert(4);
    bubbleSort.insert(3);
    bubbleSort.insert(2);
    bubbleSort.insert(1);

    //when
    int[] result = bubbleSort.sort();

    //then
    assertArrayEquals(new int[]{1,2,3,4}, result);
  }

  @Test
  public void shouldReturnSortedArrayForBiDirect() {
    //given
    BubbleSort bubbleSort = new BubbleSort(4);
    bubbleSort.insert(4);
    bubbleSort.insert(3);
    bubbleSort.insert(2);
    bubbleSort.insert(1);

    //when
    int[] result = bubbleSort.sortBiDirect();

    //then
    assertArrayEquals(new int[]{1,2,3,4}, result);
  }
}
