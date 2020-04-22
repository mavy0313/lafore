package chapter5.priorityqueue

import spock.lang.Specification

class LinkListPriorityQueueTest extends Specification {

    def "should create empty LinkListPriorityQueue"() {
        given:
        def priorityQueue = new LinkListPriorityQueue();

        when:
        def isEmpty = priorityQueue.isEmpty()

        then:
        isEmpty
    }
}
