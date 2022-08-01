object Q3 extends App{
  def toUpper(text:String):String = text.toUpperCase()
  def toLower(text:String):String = text.toLowerCase()

  def formatNames(name:String)(indexList:Int*)(funct:String=>String):String={
    if(indexList.isEmpty){
      return funct(name)
    }
    else{
      var temp = ""
      var k = 0
      while (k<name.length){
        if(indexList.contains(k)){
          temp = temp + funct(name.charAt(k).toString)
        }
        else{
          temp = temp + name.charAt(k).toString
        }
        k = k + 1
      }
      return temp
    }
  }

  println(formatNames("Benny")()(toUpper))
  println(formatNames("Niroshan")(0,1)(toUpper))
  println(formatNames("Saman")()(toLower))
  println(formatNames("Kumara")(5)(toUpper))
}
