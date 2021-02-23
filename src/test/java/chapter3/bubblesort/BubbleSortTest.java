package chapter3.bubblesort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

  @Test
  public void shouldReturnSortedArray() {
    //given
    SelectSort bubbleSort = new SelectSort(4);
    bubbleSort.insert(4);
    bubbleSort.insert(3);
    bubbleSort.insert(2);
    bubbleSort.insert(1);

    //when
    int[] result = bubbleSort.sort();

    //then
    assertArrayEquals(new int[]{1,2,3,4}, result);
  }
}
