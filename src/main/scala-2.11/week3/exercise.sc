import week3._



object nth {
  def apply(i: Int, list: Cons[Int]) = nth(i, list)

  def nth[T](index: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (index == 0) xs.head
    else nth(index - 1, xs.tail)

}

val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
nth(2,list)
nth(0,list)
nth(10,list)
nth(-1,list)
