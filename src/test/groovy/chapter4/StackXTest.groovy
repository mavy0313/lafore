package chapter4

import spock.lang.Specification

class StackXTest extends Specification {

    def "Should pop last element"() {
        given:
        StackX stack = new StackX(2)

        when:
        stack.push(1)
        stack.push(2)

        then:
        stack.pop() == 2
        stack.pop() == 1
    }

    def "Stack is full"() {
        given:
        def stack = new StackX(1)

        when:
        stack.push(1)

        then:
        stack.isFull()
    }

    def "Stack is empty"() {
        given:
        def stack = new StackX(1)

        when:
        stack.push(1)
        stack.pop()

        then:
        stack.isEmpty()
    }

    def "Stack peek"() {
        given:
        def stack = new StackX(2)
        stack.push(1)
        stack.push(2)

        when:
        def result = stack.peek()

        then:
        result == 2
    }
}
