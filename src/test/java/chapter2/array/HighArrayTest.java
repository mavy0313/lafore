package chapter2.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HighArrayTest {

  @Test
  public void shouldReturnOriginalArrayIfNoDupsFound() {
    //given
    HighArray array = new HighArray(2);
    array.insert(1);
    array.insert(2);

    //when
    long[] result = array.noDups();

    //then
    assertArrayEquals(new long[]{1,2}, result);
  }

  @Test
  public void shouldRemoveDuplicates() {
    //given
    HighArray array = new HighArray(8);
    array.insert(1);
    array.insert(2);
    array.insert(2);
    array.insert(2);
    array.insert(3);
    array.insert(4);
    array.insert(5);
    array.insert(5);

    //when
    long[] result = array.noDups();

    //then
    assertArrayEquals(new long[]{1,2,3,4,5}, result);
  }

}