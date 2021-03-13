package chapter3.insertsort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertSortTest {

  @Test
  public void shouldReturnSortedArray() {
    //given
    InsertSort insertSort = new InsertSort(4);
    insertSort.insert(4);
    insertSort.insert(3);
    insertSort.insert(2);
    insertSort.insert(1);

    //when
    int[] result = insertSort.sort();

    //then
    assertArrayEquals(new int[]{1,2,3,4}, result);
  }

  @Test
  public void shouldReturnMedianForTwoNumbers() {
    //given
    InsertSort insertSort = new InsertSort(3);
    insertSort.insert(3);
    insertSort.insert(2);
    insertSort.insert(1);

    //when
    int result = insertSort.median();

    //then
    assertEquals(2, result);
  }
}
