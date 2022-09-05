import scala.io.StdIn.{readBoolean, readChar, readInt, readLine}
object Q1 extends App {

  //assuming shift is forward

  def encrypt(): Unit ={
    print("Enter text to encrypt : ")
    val text = readLine()
    print("Enter number of shifts : ")
    val shift = readInt()
    val encrypted_text = text.map(char=>((char.toInt-64+shift)%26+64).toChar)
    print(s"The encrypted text is : ${encrypted_text}")
  }

  def decrypt(): Unit ={
    print("Enter text to decrypt : ")
    val text = readLine()
    print("Enter number of shifts : ")
    val shift = readInt()
    val decrypted_text = text.map(char=>((char.toInt-64-shift)%26+64).toChar)
    print(s"The decrypted text is : ${decrypted_text}")
  }

  def cipher(): Unit ={
    print("Do you want to encrypt or decrypt data? Say Yes if encrypt. [Y/N] : ")
    val choice = readChar()
    if (choice == 'Y') encrypt() else decrypt()
  }

  cipher()
}
