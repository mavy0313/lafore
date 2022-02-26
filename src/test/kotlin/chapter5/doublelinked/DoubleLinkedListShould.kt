package chapter5.doublelinked

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class DoubleLinkedListShould {

    @Test
    fun `get first from empty list`() {
        //given
        val list = DoubleLinkedList()

        //when
        val first = list.getFirst()

        //then
        assertNull(first)
    }

    @Test
    fun `insert first into empty list`() {
        //given
        val list = DoubleLinkedList()
        list.insertFirst(1)

        //when
        val first = list.getFirst()

        //then
        assertEquals(1, first)
    }

    @Test
    fun `insert first into non empty list`() {
        //given
        val list = DoubleLinkedList()
        list.insertFirst(1)
        list.insertFirst(2)

        //when
        val first = list.getFirst()

        //then
        assertEquals(2, first)
    }

    @Test
    fun `insert first multiple items and get all`() {
        //given
        val list = DoubleLinkedList()
        list.insertFirst(1)
        list.insertFirst(2)

        //when
        val allItems = list.getAll()

        //then
        assertEquals(listOf(2, 1), allItems)
    }

    @Test
    fun `insert first multiple items and get all 2`() {
        //given
        val list = DoubleLinkedList()
        list.insertFirst(2)
        list.insertFirst(3)

        //when
        val allItems = list.getAll()

        //then
        assertEquals(listOf(3, 2), allItems)
    }



}