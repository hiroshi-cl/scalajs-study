import scala.scalajs.js
import js.annotation._

@ScalaJSDefined
class Foo extends js.Object {
  val x: Int = 4
  def bar(x: Int): Int = x + 1
}

@ScalaJSDefined
class Bar extends js.Object {
  val x: Int = 5
  var y: String = "hello"
  def z: Int = 42
  def z_=(v: Int): Unit = println("z = " + v)
  def foo(x: Int): Int = x + 1
}

@ScalaJSDefined
class Baz extends js.Object {
  override def toString(): String = super.toString() + " in Foo"
}


import scala.scalajs.js
import js.annotation.JSExport

@JSExport
object HelloWorld {
  @JSExport
  def main(): Unit = {
    println("Hello world!")
  }
}

@JSExport
class Point(_x: Double, _y: Double) {
  @JSExport
  val x: Double = _x
  @JSExport
  var y: Double = _y
  @JSExport
  def abs: Double = Math.sqrt(x*x + y*y)
  @JSExport
  def sum: Double = x + y
  @JSExport
  def sum_=(v: Double): Unit = y = v - x
}


trait PointT {
  val _x: Double
  val _y: Double

  @JSExport
  val x: Double = _x
  @JSExport
  var y: Double = _y
  @JSExport
  def abs: Double = Math.sqrt(x*x + y*y)
  @JSExport
  def sum: Double = x + y
  @JSExport
  def sum_=(v: Double): Unit = y = v - x
}



@JSExport
class Points(val ps: Seq[Point]) {
  import js.JSConverters._

  @JSExport
 def toJsArray: js.Array[Point] = ps.toJSArray
}
@JSExport
class Point2D(val st: Point, val en: Point)


class Scala()