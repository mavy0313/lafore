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
    !list.isEmpty()
  }


}
