import me.tyranron.fpinscala.Exercise_2_1.fib
import org.scalatest.flatspec.AnyFlatSpec

class Exercise_2_1 extends AnyFlatSpec {
  "fib" should "work" in {
    for ((input, expected) <- List(
      (1, 0),
      (2, 1),
      (3, 1),
      (4, 2),
      (5, 3),
      (6, 5),
      (7, 8),
    )) {
      assert(fib(input) == expected)
    }
  }
}
