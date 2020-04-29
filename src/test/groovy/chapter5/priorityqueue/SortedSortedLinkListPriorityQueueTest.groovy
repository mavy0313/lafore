package chapter5.priorityqueue

import spock.lang.Specification

class SortedSortedLinkListPriorityQueueTest extends Specification {

  def "should create empty SortedLinkListPriorityQueue"() {
    given:
    def priorityQueue = new SortedLinkListPriorityQueue();

    when:
    def isEmpty = priorityQueue.isEmpty()

    then:
    isEmpty
  }

  def "should not be empty after inserting item"() {
    given:
    def priorityQueue = new SortedLinkListPriorityQueue();

    when:
    priorityQueue.insert(1L)
    def isEmpty = priorityQueue.isEmpty()

    then:
    !isEmpty
  }

  def "should remove sorted items"() {
    given:
    def priorityQueue = new SortedLinkListPriorityQueue();
    priorityQueue.insert(3L)
    priorityQueue.insert(2L)
    priorityQueue.insert(1L)

    when:
    def item1 = priorityQueue.remove();
    def item2 = priorityQueue.remove();
    def item3 = priorityQueue.remove();
    def isEmpty = priorityQueue.isEmpty()

    then:
    item1 == 1L
    item2 == 2L
    item3 == 3L
    isEmpty
  }
}
