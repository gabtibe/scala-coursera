import scala.annotation.tailrec

class Rational(x: Int, y: Int) {
  require(y!=0, "Denominator must be non-zero")

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val numer = x
  val denom = y

  def this(x: Int) = this(x, 1)

  def + (that: Rational): Rational = {
    new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)
  }

  def - (that: Rational): Rational = this + -that

  def unary_- : Rational = {
    new Rational(this.numer * -1, this.denom)
  }

  def * (that: Rational): Rational = {
    new Rational(this.numer * that.numer, this.denom * that.denom)
  }

  def < (that: Rational): Boolean = {
    this.numer * that.denom < that.numer * this.denom
  }

  def max(that: Rational): Rational = {
    if (this < that) that else this
  }

  override def toString = this.numer / gcd(this.numer, this.denom) + "/" + this.denom / gcd(this.numer, this.denom)
}

object rationals {
  val x = new Rational(1,2)
  println(x.numer)
  println(x.denom)
  val y = new Rational(2,3)
  x + y
}

val x = new Rational(1,3)
x.numer
x.denom

val y = new Rational(5,7)
val z = new Rational(3,2)
val t = new Rational(3)


x + y * -z

x

x - y - z

y + y

y < y

y.max(z)

val u = 23
assert(u >= 0)

new Rational(1,2) < (new Rational(2,3))
