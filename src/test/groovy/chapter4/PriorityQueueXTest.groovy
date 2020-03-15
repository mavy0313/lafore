package chapter4

import spock.lang.Specification

class PriorityQueueXTest extends Specification {

    def "should remove elements in increasing order"() {
        given:
        def priorityQueueX = new PriorityQueueX(3)
        priorityQueueX.insert(3)
        priorityQueueX.insert(2)
        priorityQueueX.insert(1)

        when:
        def first = priorityQueueX.remove()
        def second = priorityQueueX.remove()
        def third = priorityQueueX.remove()

        then:
        first == 1
        second == 2
        third == 3
    }
}
