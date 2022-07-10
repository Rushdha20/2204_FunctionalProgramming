object Q4Part_a extends App{
  def wage(workhr:Int):Int=workhr*250
  def ot(OThr:Int):Int=OThr*85
  def income(workhr:Int,OThr:Int):Int=wage(workhr)+ot(OThr)
  def tax(income:Int):Double=income*.12
  def takeHomeSalary(workhr:Int,OThr:Int):Double=income(workhr,OThr)-tax(income(workhr,OThr))
  println("Rs. "+takeHomeSalary(40,30))
}
