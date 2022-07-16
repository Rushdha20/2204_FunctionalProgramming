object Q4 extends App{
  def odd_or_even(n:Int):String=n match {
    case n if(n%2==0) => "Even"
    case _ => "Odd"
  }
  println(odd_or_even(20))
  println(odd_or_even(17))
}
