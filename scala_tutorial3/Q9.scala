object Q9 extends App{
  def cal(a: Int, b: Int, c: Char): Any = c match {
    case '+' => a + b
    case '-' => a - b
    case '*' => a * b
    case '/' => a / b
    case _ => "Invalid Operation"
  }
  println(cal(10,7,'+'))
  println(cal(4,5,'*'))
  println(cal(2,5,'-'))
  println(cal(7,2,'/'))
}
