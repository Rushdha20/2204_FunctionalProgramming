object Q6_b extends App{
  def average(mark1:Int,mark2:Int,mark3:Int):Double=(mark1+mark2+mark3)/3
  def grade(mark1:Int,mark2:Int,mark3:Int):String={
    if(average(mark1:Int,mark2:Int,mark3:Int)<69.0){
      if(average(mark1:Int,mark2:Int,mark3:Int)<54.0){
        if(average(mark1:Int,mark2:Int,mark3:Int)<=39.0){
          "Fail"
        }
        else{
          "Pass"
        }
      }
      else{
        "Good"
      }
    }
    else{
      "Very Good"
    }
  }
  println(grade(50,35,60))
}
