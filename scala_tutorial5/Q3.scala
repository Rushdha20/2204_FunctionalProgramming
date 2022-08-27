object Q3 extends App{
  def sum(n:Int):Int={
    if(n>1) n+sum(n-1)
    else return 1
  }

  println(sum(5))
}
