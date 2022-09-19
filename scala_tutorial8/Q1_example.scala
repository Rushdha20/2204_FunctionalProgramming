object Q1_example extends App{
  val point1 = Point(2, 7)
  val point2 = Point(0, 3)

  //Adding 2 given points
  println(s"${point1} + ${point2} = ${point1 + point2}")

  //Moving point1 by dx=2 and dy=3
  println(s"New point after moving ${point1} by dx=2 and dy=3 is ${point1.move(2, 3)}")

  //Distance between point1 and point2
  println(s"Distance between ${point1} and ${point2} is ${point1.getDistance(point2)}")

  //Inverting point1
  println(s"Invert of ${point1} is ${point1.invert()}")
}
