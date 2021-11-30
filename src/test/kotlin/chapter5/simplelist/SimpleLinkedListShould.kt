package chapter5.simplelist

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimpleLinkedListShould {

    @Test
    fun `insert first one element`() {
        //given
        val linkedList = SimpleLinkedList()

        //when
        linkedList.insertFirst(1)
        val firstElement = linkedList.getFirst()

        //then
        assertEquals(1, firstElement)
    }

    @Test
    fun `insert first two elements`() {
        //given
        val linkedList = SimpleLinkedList()

        //when
        linkedList.insertFirst(1)
        linkedList.insertFirst(2)
        val firstElement = linkedList.getFirst()

        //then
        assertEquals(2, firstElement)
    }

    @Test
    fun `return all elements`() {
        //given
        val linkedList = SimpleLinkedList()

        //when
        linkedList.insertFirst(1)
        linkedList.insertFirst(2)
        val elements = linkedList.getAll()

        //then
        assertEquals(listOf(2,1), elements)
    }

    @Test
    fun `delete first and only element`() {
        //given
        val linkedList = SimpleLinkedList()
        linkedList.insertFirst(1)

        //when
        val deleted = linkedList.deleteFirst()

        //then
        assertEquals(1, deleted.data)
    }

    @Test
    fun `delete first element`() {
        //given
        val linkedList = SimpleLinkedList()
        linkedList.insertFirst(1)
        linkedList.insertFirst(2)

        //when
        val deleted = linkedList.deleteFirst()

        //then
        assertEquals(2, deleted.data)
    }

    @Test
    fun `display all elements`() {
        //given
        val linkedList = SimpleLinkedList()
        linkedList.insertFirst(1)
        linkedList.insertFirst(2)
        linkedList.insertFirst(3)

        //when
        linkedList.displayList()

        //then
    }


}