object Q1 extends App{
  import scala.io.StdIn.readInt

  def interest(deposit: Int): Double = deposit match {
    case x if deposit <= 20000 => x * 0.02
    case x if deposit <= 200000 => x * 0.04
    case x if deposit <= 2000000 => x * 0.035
    case _ => deposit * 0.065
  }

  println("Enter the deposit amount for the year : ")
  var d = readInt()
  println("The value of interest for the year is : Rs."+interest(d))
}
