import sun.jvm.hotspot.runtime.amd64.AMD64CurrentFrameGuess

def and(x: Boolean, y: Boolean) = if (x) y else false
and(true, false)
and(true, true)

def or(x: Boolean, y: Boolean) = if (x) true else if (y) true else false
or(false, true)
or(false, false)
or(true, true)

trait sqrt {
  def abs(x: Double): Double = if (x > 0) x else -x
  def sqrtIter(guess: Double, x: Double): Double = if (isGoodGuess(guess, x)) guess else sqrtIter(improve(guess, x), x)
  def isGoodGuess(guess: Double, x: Double): Boolean
  def improve(guess: Double, x: Double): Double = (guess + x / guess ) / 2
}

object sqrt1 extends sqrt{
  def apply(i: Double) = sqrt(i)

  def isGoodGuess(guess: Double, x: Double): Boolean = abs(guess * guess - x) < 0.0001

  def sqrt(x: Double) = sqrtIter(1.0, x)
}
object sqrtMod extends sqrt{

  def apply(x: Double) = sqrtIter(1.0, x)

  def isGoodGuess(guess: Double, x: Double): Boolean = abs(guess * guess - x) / x < 0.001

}

sqrt1(2)
sqrt1(4)
sqrt1(1e-6)
// sqrt1(1e60)

println("Modified isGoodGuess method")
sqrtMod(2)
sqrtMod(1e-6)
sqrtMod(1e60)
