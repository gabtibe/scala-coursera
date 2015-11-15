/**
def sum(cube)(a: Int, b: Int): Int = {
  if (a > b) 0
  else cube(a) + sum(cube)(a+1, b)
}
  */

def cube(x: Int): Int = x * x * x

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1, b))

def product(f: Int => Int)(a: Int, b:Int) = mapReduce(f, (x,y) => x * y, 1)(a, b)
product(x => x * x)(3,4)

def factorial(n: Int) = product(x => x)(1,n)
factorial(5)



