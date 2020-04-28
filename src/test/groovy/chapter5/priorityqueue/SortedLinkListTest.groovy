package chapter5.priorityqueue

import spock.lang.Specification

class SortedLinkListTest extends Specification {

  def "should be empty when created"() {
    expect:
    new SortedLinkList().isEmpty()
  }

  def "should not be empty when inserted"() {
    given:
    def list = new SortedLinkList()

    when:
    list.insert(1L)

    then:
    !list.empty
  }

  def "should remove 2 sorted items"() {
    given:
    def list = new SortedLinkList()
    list.insert(2L)
    list.insert(1L)

    when:
    def item1 = list.remove()

    then:
    item1 == 1L
    !list.empty

    when:
    def item2 = list.remove()

    then:
    item2 == 2L
    list.empty
  }

}
