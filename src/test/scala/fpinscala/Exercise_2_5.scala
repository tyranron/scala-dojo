import me.tyranron.fpinscala.Exercise_2_5.compose
import org.scalatest.flatspec.AnyFlatSpec

class Exercise_2_5 extends AnyFlatSpec {
  "compose" should "work" in {
    val add8 = compose((x: Int) => x + 3, (y: Int) => y + 5)

    assert(add8(2) == 10)
  }
}
