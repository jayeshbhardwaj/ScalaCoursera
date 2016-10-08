/**
 * Created by jayeshb on 9/1/16.
 */

package week4

trait List[+T]{
  def isEmpty:Boolean
  def head:T
  def tail:List[T]
  def prepend[U>:T](elem:U):List[U] = new Cons[U](elem,this)
}

class Cons[T] (val head: T,val tail: List[T]) extends List[T]{
  def isEmpty = false
}

object Nil extends List[Nothing]{
  def isEmpty = true
  def head:Nothing = throw new NoSuchElementException("Nil.head")
  def tail:Nothing = throw new NoSuchElementException("Nil.tail")
}

object test{
  val x:List[String] = Nil
}
