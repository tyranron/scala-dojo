import me.tyranron.fpinscala.Exercise_2_2.isSorted
import org.scalatest.flatspec.AnyFlatSpec

class Exercise_2_2 extends AnyFlatSpec {
  "isSorted" should "work" in {
    for ((input, expected) <- List(
      (Array[Int](), true),
      (Array(3), true),
      (Array(3, 4), true),
      (Array(3, 3), true),
      (Array(4, 3), false),
      (Array(3, 4, 5, 3), false),
    )) {
      assert(isSorted(input, (x, y) => x <= y) == expected)
    }
  }
}
