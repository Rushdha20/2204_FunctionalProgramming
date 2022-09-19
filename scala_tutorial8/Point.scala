case class Point (x:Int , y:Int) {
  def a:Int = x
  def b:Int = y

  def +(other: Point) = Point(this.x + other.x, this.y + other.y)
  def move(distanceX: Int, distanceY: Int) = Point(this.x + distanceX, this.y + distanceY)
  def getDistance(other: Point) = scala.math.round(scala.math.sqrt(scala.math.pow(this.x - other.x, 2) + scala.math.pow(this.y - other.y, 2))).toInt
  def invert() = Point(this.y, this.x)
}

