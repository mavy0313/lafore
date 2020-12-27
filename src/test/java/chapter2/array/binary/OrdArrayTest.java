package chapter2.array.binary;

import jdk.internal.org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdArrayTest {

  @Test
  public void shouldMergeTwoOrderedArrays() {
    //given
    OrdArray ordArray = new OrdArray(3);

    long[] array1 = new long[]{1};
    long[] array2 = new long[]{2,3};

    //when
    long[] result = ordArray.merge(array1, array2);

    //then
    assertArrayEquals(new long[]{1,2,3}, result);
  }

}