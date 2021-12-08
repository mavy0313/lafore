package chapter5.firstlastlist

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstLastListShould {

    @Test
    fun `insert first one element`() {
        //given
        val list = FirstLastList()

        //when
        list.insertFirst(1)
        val firstElement = list.getFirst()

        //then
        assertEquals(1, firstElement)
    }
}