import scala.io.StdIn

object CollatzApp extends App {

  def collatz(num: Int, count : Int = 0): Int = {
    if(num == 1) {
      count+ 1
    }
    else {

      if(num % 2 == 0) {collatz(num / 2,count + 1)}

      else {collatz(num*3 + 1, count + 1)}
    }

}

  val enteredNumber = StdIn.readLine("Welcome to the Collatz Application\n\nEnter a number to start with: ").toInt
  println(collatz(enteredNumber))

}