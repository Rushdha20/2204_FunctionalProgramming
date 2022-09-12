class account(bal: Double){

  var balance: Double = bal

  def credit(amount: Double): Unit = this.balance += amount

  def debit(amount: Double): Boolean =
    if(balance > amount) {
      balance -= amount
      true
    }
    else{
      false
    }

  def transfer(amount: Double, other: account): Boolean =
    if(other.balance > amount) {
      other.debit(amount)
      this.credit(amount)
      true
    }
    else{
      false
    }

  override def toString() = s"Balance is Rs.${this.balance}"
}
