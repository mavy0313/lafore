package chapter5.towers


class Towers {

  companion object {
    fun doTowers(topN: Int, from: Char, inter: Char, to: Char) {
      if (topN == 1) {
        println("Disk 1 from $from to $to")
      } else {
        doTowers(topN - 1, from, to, inter)//from -> inter
        println("Disk $topN from $from to $to")
        doTowers(topN - 1, inter, from, to)//inter -> to
      }
    }
  }
}

fun main() {
  val name = "Bob"
  println("Hi $name")

  Towers.doTowers(3, 'A', 'B', 'C')
}

