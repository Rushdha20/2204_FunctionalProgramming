object Q7 extends App{
  def month_no(month:String):Int=month match{
    case "January" => 1
    case "February" => 2
    case "March" => 3
    case "April" => 4
    case "May" => 5
    case "June" => 6
    case "July" => 7
    case "August" => 8
    case "September" => 9
    case "October" => 10
    case "November" =>11
    case "December" => 12
    case _ =>0
  }
  def season(month:String):String= {
    if(month_no(month)==12 || month_no(month)==1 || month_no(month)==2){
      "Winter"
    }
    else if(month_no(month)==3 || month_no(month)==4 || month_no(month)==5){
      "Spring"
    }
    else if(month_no(month)==6 || month_no(month)==7 || month_no(month)==8){
      "Summer"
    }
    else if(month_no(month)==9 || month_no(month)==10 || month_no(month)==11){
      "Autumn"
    }
    else{
      "Bogus month"
    }
  }
  println(season("October"))
}
