object Q3 extends App {
  var firstAccount = new account(700)
  var secondAccount = new account(770)

  // Perform the transaction
  val result = firstAccount.transfer(1000, secondAccount)
  if(result) println("Transaction completed")
  else println("Transaction failed")
  println(s"Balance of first account = ${firstAccount.balance}")
  println(s"Balance of second account = ${secondAccount.balance}")
}
