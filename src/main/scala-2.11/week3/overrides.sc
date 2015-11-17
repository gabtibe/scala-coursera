object overrides {
  println("Welcome to this Worksheet")
}

abstract class Base {
  def foo = 1
  def bar: Int
}

class Sub extends Base {
  override def foo = 3
  def bar = 1
}

