import scala.io.StdIn

object CollatzApp extends App {

  def collatz(n: Int, c : Int = 0): Int = {
    if(n == 1) {
      c+ 1
    }
    else {

      if(n % 2 == 0) {collatz(n / 2,c + 1)}

      else {collatz(n*3 + 1, c + 1)}
    }

}

  val enteredNumber = StdIn.readLine("Welcome to the Collatz Application\n\nEnter a number to start with: ").toInt
  println(collatz(enteredNumber))

}