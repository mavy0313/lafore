package chapter5.doublelinked

class DoubleLinkedList {

    private var first: Link? = null

    fun getFirst(): Int? {
        return first?.data
    }

    fun insertFirst(item: Int) {
        val newLink = Link(item)
        if (first == null) {
            this.first = newLink
        } else {
            newLink.next = first
            first = newLink
        }
    }

    fun getAll(): List<Int> {
        var current = first
        val result = mutableListOf<Int>()
        while (current != null) {
            result.add(current.data)
            current = current.next
        }
        return result
    }

}

class Link(val data: Int) {
    var next: Link? = null
}
