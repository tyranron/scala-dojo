package me.tyranron
package fpinscala

object Exercise_2_1 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(i: Int, prev: Int, acc: Int): Int =
      if (i <= 2) acc
      else go(i - 1, acc, prev + acc)

    if (n < 2) 0
    else go(n, 0, 1)
  }
}
