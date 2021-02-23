package chapter3.insertsort;

import chapter3.selectsort.SelectSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertSortTest {

  @Test
  public void shouldReturnSortedArray() {
    //given
    InsertSort selectSort = new InsertSort(3);
//    selectSort.insert(4);
    selectSort.insert(3);
    selectSort.insert(2);
    selectSort.insert(1);

    //when
    int[] result = selectSort.sort();

    //then
//    assertArrayEquals(new int[]{1,2,3,4}, result);
    assertArrayEquals(new int[]{1,2,3}, result);
  }
}
