package chapter5.priorityqueue

import spock.lang.Specification

class LinkListTest extends Specification{

  def "should be empty when created"() {
    expect:
    new LinkList().isEmpty()
  }

  def "should not be empty when inserted"() {
    given:
    def list = new LinkList()

    when:
    list.insert(1L)

    then:
    !list.empty
  }

  def "should remove inserted item"() {
    given:
    def list = new LinkList()
    list.insert(1L)

    when:
    def result = list.remove()

    then:
    result == 1L
    list.empty
  }

  def "should remove 2 inserted items"() {
    given:
    def list = new LinkList()
    list.insert(1L)
    list.insert(2L)

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

//  def "should return 2 items"() {
//    given:
//
//    when:
//
//    then:
//    1L ==
//  }

//  def "should return min item"() {
//    given:
//    def list = new LinkList()
//    list.insert(1L)
//    list.insert(2L)
//
//    when:
//    def min = list.remove()
//
//    then:
//    min == 1L
//  }

}
