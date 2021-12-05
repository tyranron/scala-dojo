import me.tyranron.fpinscala.Exercise_2_3.curry
import org.scalatest.flatspec.AnyFlatSpec

class Exercise_2_3 extends AnyFlatSpec {
  "curry" should "work" in {
    val add = curry((x: Int, y: Int) => x + y)

    assert(add(3)(4) == 7)

    val add3 = add(3)
    assert(add3(5) == 8)
  }
}
