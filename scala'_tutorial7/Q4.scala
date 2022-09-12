object Q4 extends App {
  val accounts = List(new account(1000), new account(-250), new account(2500), new account(7200), new account(-1000), new account(1200))

  val bank = new bank(accounts);

  // Getting accounts which has negative balance
  println("Accounts with negative values are follows:")
  println(s"${bank.getNegatives()}")

  // Getting sum of all accounts
  println(s"Sum of balances ${bank.getSum()}")

  // Adding interest
  println("Before applying interest")
  println(bank)
  bank.applyInterest()
  println("After applying interest")
  println(bank)
}
