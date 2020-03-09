package chapter4

import spock.lang.Specification

class QueueXTest extends Specification {

    def "should insert and remove same element"() {
        given:
        def queue = new QueueX(1)

        when:
        queue.insert(1)

        then:
        queue.remove() == 1
    }

    def "should insert 2 elements"() {
        given:
        def queue = new QueueX(2)

        when:
        queue.insert(1)
        queue.insert(2)

        then:
        queue.remove() == 1
        queue.remove() == 2
    }

    def "should be full"() {
        given:
        def queue = new QueueX(2)

        when:
        queue.insert(1)
        queue.insert(2)

        then:
        queue.isFull()
    }

    def "should be empty"() {
        given:
        def queue = new QueueX(1)

        when:
        queue.insert(1)
        queue.remove()

        then:
        queue.isEmpty()
    }
}
