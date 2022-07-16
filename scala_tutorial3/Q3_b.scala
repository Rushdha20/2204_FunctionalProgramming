object Q3_b extends App{
  def max(a: Int, b: Int, c: Int): Int = if(a>b){if(a>c)a else c} else{if(b>c) b else c}
  println(max(8,1,4))
}
