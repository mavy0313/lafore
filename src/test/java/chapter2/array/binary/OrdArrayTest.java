package chapter2.array.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OrdArrayTest {

  @Test
  public void shouldMergeTwoOrderedArrays() {
    //given
    OrdArray ordArray = new OrdArray(7);

    long[] array1 = new long[]{1,3,9};
    long[] array2 = new long[]{2,6,7,8};

    //when
    long[] result = ordArray.merge(array1, array2);

    //then
    assertArrayEquals(new long[]{1,2,3,6,7,8,9}, result);
  }

}