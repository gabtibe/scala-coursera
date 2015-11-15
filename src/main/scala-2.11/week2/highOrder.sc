def sumInts(a: Int,b: Int): Int =
  if (a > b) 0 else a + sumInts(a+1, b)

def cube(x: Int): Int = x * x * x

def sumCubes(a: Int,b: Int): Int =
  if (a > b) 0 else cube(a) + sumCubes(a+1, b)

def fact(n: Int): Int =
  if (n == 1) 1 else n * fact(n-1)

def sumFactorials(a: Int, b: Int): Int =
  if (a > b) 0 else fact(a) + sumFactorials(a+1, b)

def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a+1, b)

def sumInts1(a: Int, b: Int) = sum(x => x, a, b)
def sumCubes1(a: Int, b: Int) = sum(x => x * x * x, a, b)
def sumFactorials1(a: Int, b: Int) = sum(fact, a, b)

def id(x: Int): Int = x

sumCubes1(2, 4)

def sum2(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

sum((x: Int) => x * x, 4,6)
