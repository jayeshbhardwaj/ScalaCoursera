trait Expr
case class Number(n:Int) extends Expr
case class Sum(leftOp:Expr,rightOp:Expr) extends Expr


object test{

  def show(e:Expr):String = e match {
    case Number(n) => n.toString
    case Sum(e1,e2) => show(e1) + "+" + show(e2)
  }
  println(show(Sum(Number(1),Number(2))))
}