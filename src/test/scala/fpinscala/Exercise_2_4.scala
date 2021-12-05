import me.tyranron.fpinscala.Exercise_2_4.uncurry
import org.scalatest.flatspec.AnyFlatSpec

class Exercise_2_4 extends AnyFlatSpec {
  "uncurry" should "work" in {
    val add = uncurry((x: Int) => (y: Int) => x + y)

    assert(add(3, 4) == 7)
  }
}
