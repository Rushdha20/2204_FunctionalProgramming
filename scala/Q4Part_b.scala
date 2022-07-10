object Q4Part_b extends App{
  def attendees(price:Int):Int=120+(15-price)/5*20 //data given that there is a change of 20 people for every Rs.5
  def revenue(price:Int):Int=attendees(price)*price
  def cost(price:Int):Int=500+3*attendees(price)
  def profit(price:Int):Int=revenue(price)-cost(price)

  //taking prices ranging from Rs.5 upto around Rs.45 with a difference of Rs.5
  // we can see the variation in profit and decide on the approximate price with maximum profit
  println(profit(5),profit(15),profit(25),profit(35),profit(45))
  println(profit(23),profit(24),profit(28),profit(29))
}
