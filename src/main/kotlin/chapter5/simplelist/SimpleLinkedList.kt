package chapter5.simplelist

class SimpleLinkedList {
    private var first: Link? = null

    fun insertFirst(elem: Int) {
        val newLink = Link(elem)
        newLink.next = first
        this.first = newLink
    }

    fun getFirst(): Int {
        return first!!.data
    }

    fun getAll(): List<Int> {
        val all = ArrayList<Int>()
        var current = first
        while (current != null) {
            all.add(current.data)
            current = current.next
        }
        return all
    }

    fun deleteFirst(): Link {
        val deleted = first
        first = first!!.next
        return deleted!!
    }

    fun displayList() {
        var current = first
        while (current != null) {
            println("${current.data}")
            current = current.next
        }
    }

}

class Link(val data: Int) {

    var next: Link? = null
}
