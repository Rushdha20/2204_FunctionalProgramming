object Q2 extends App{
  import scala.io.StdIn.readInt

  def number_type(int:Int):String = int match {
    case x if x<0 => "Negative"
    case x if x==0 => "Zero"
    case x if x>0 && x%2==0 => "Even"
    case _ => "Odd"
  }

  println("Enter integer : ")
  var i = readInt()
  println("The number entered is : "+number_type(i))
}
