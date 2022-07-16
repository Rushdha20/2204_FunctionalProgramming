object Q5 extends App{
  def checknum(a:Int,b:Int):Unit={
    if(a==1)if(b==1)println("***")else println("###") else println("===")
  }

  checknum(1,1)
  checknum(1,2)
  checknum(2,2)
  checknum(2,3)
}
