/**
 * Created by jayeshb on 9/14/16.
 */
package week5

trait Expr
case class Number(n:Int) extends Expr
case class Sum(leftOp:Expr,rightOp:Expr) extends Expr
case class Prod(leftOp:Expr,rightOp:Expr) extends Expr
case class Var(x:String) extends Expr

object test{
  def show(e:Expr):String = e match {
    case Number(n) => n.toString
    case Var(x) => x
    case Sum(e1,e2) => show(e1) + "+" + show(e2)
    case Prod(e1,e2) => show(e1) + "*" + show(e2)
  }

  def main(arr:Array[String]): Unit = {
    println(show(Sum(Number(1),Number(2))))
  }

}

trait palindrome[T] {
  def isPalindrome:Boolean
}

class StringPal[String]{
  def isPalindrome = {

  }
}
class BigString(x:StringPal,y:StringPal){
  def isPalindrome = {

  }
}