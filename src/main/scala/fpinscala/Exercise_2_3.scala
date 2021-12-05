package me.tyranron
package fpinscala

object Exercise_2_3 {
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a) => (b) => f(a, b)
}
