class rational(x: Int, y: Int) {
  def num: Int = x
  def deno: Int = y

  def neg() = new rational(-this.num, this.deno)

  def -(other: rational) = new rational(this.num * other.deno - this.deno * other.num, this.deno * other.deno)

  override def toString: String = num + "/" + deno
}
