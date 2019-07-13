package chapter4

import spock.lang.Specification
import spock.lang.Unroll

class ReverserTest extends Specification {

    @Unroll
    def "Reverse string of '#input' is '#reversed'"() {
        given:
        Reverser reverser = new Reverser()

        expect:
        reverser.reverse(input) == reversed

        where:
        input               || reversed
        "Spock data tables" || "selbat atad kcopS"
        "Иван-123"          || "321-навИ"
        " "                 || " "
    }
}
