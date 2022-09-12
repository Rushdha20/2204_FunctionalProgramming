object Q2 extends App {
  val x = new rational(3, 4)
  val y = new rational(5, 8)
  val z = new rational(2, 7)

  val answer = x - y - z
  println(s"Result of the calculation is ${answer}")
}
