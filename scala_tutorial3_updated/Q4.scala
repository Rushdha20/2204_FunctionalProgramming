object Q4 extends App {

  //total amount for 60 books
  def booksPrice(no_of_books:Int):Double=no_of_books*24.95

  def discount(price:Double):Double=(price*0.4)

  def shipping_cost(n:Int):Double= n match {
    case n if n<=50 => 3*n
    case _ => 3*n + (n-50)*.75
  }

  def final_cost_of_books(n:Int):Double =booksPrice(n)-discount(booksPrice(n))+shipping_cost(n)
  println("Total wholesale cost for 60 copies")
  println("Rs." + final_cost_of_books(60))
}
