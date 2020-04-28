package chapter5.priorityqueue

import spock.lang.Specification

class SortedLinkListPriorityQueueTest extends Specification {

  def "should create empty SortedLinkListPriorityQueue"() {
    given:
    def priorityQueue = new LinkListPriorityQueue();

    when:
    def isEmpty = priorityQueue.isEmpty()

    then:
    isEmpty
  }

  def "should insert LinkListPriorityQueue"() {
    given:
    def priorityQueue = new LinkListPriorityQueue();

    when:
    priorityQueue.insert(1L)
    def isEmpty = priorityQueue.isEmpty()

    then:
    !isEmpty
  }
}
