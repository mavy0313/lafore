package chapter5.firstlastlist

class FirstLastList {

    private var first: Link?
    private var last: Link?

    constructor() {
        first = null
        last = null
    }

    fun insertFirst(item: Int) {
        val newLink = Link(item)
        if (isEmpty()) {
            last = newLink
        }
        newLink.next = first
        first = newLink
    }

    private fun isEmpty(): Boolean {
        return first == null
    }

    fun getFirst(): Int {
        return first!!.data
    }

}

class Link(val data: Int) {

    var next: Link? = null
}
