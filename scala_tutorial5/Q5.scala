object Q5 extends App{

  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def updated_sum(current: Int, upper: Int): Int =
    if(current < upper && isEven(current)) current + updated_sum(current + 1, upper)
    else if(current < upper && !isEven(current)) updated_sum(current + 1, upper)
    else 0

  def sum_even(n:Int):Int = updated_sum(1, n)

  println(sum_even(7))
  println(sum_even(10))
}
