object Q8 extends App{
  def CelsiusToFarenheit(temp:Float):Float=temp*9/5+32
  def FarenheitToCelsius(temp:Float):Float=(temp-32)*5/9
  println(CelsiusToFarenheit(100))
  println(FarenheitToCelsius(104))
}
