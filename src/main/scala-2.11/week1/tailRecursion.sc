import scala.annotation.tailrec

println("Euclid's Algorithm GCD")

@tailrec
def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

gcd(22,16)
gcd(14,21)

def factorial(n: Int): BigDecimal =
  if(n == 1) 1 else n * factorial(n-1)

factorial(100)

@tailrec
def tailRecFactorial(n: Int): Int = {
  def loop(acc: Int, n: Int) =
    if (n == 0) acc else loop(acc * n, n - 1)
  loop(1, n)
}

tailRecFactorial(4)

