object Q6_a extends App{
  def average(mark1:Int,mark2:Int,mark3:Int):Double=(mark1+mark2+mark3)/3
  def grade(mark1:Int,mark2:Int,mark3:Int):String= {
    if(average(mark1:Int,mark2:Int,mark3:Int)<0) {
      "Invalid Marks"
    }
    else if(average(mark1:Int,mark2:Int,mark3:Int)<=39.0){
      "Fail"
    }
    else if(average(mark1:Int,mark2:Int,mark3:Int)<=54.0){
      "Pass"
    }
    else if(average(mark1:Int,mark2:Int,mark3:Int)<=69.0){
      "Good"
    }
    else{
      "Very Good"
    }
  }
  println(grade(80,50,75))
}
