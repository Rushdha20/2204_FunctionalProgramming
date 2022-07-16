object Q5 extends App {

  //time taken at easy pace
  def easy(x:Int):Int=x*8

  //time taken at tempo
  def tempo(x:Int):Int=x*7

  //total time taken
  var total_time_taken = easy(2)+tempo(3)+easy(2)

  println("total running time = "+ total_time_taken + " minutes")
}
