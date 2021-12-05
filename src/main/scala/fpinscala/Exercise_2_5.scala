package me.tyranron
package fpinscala

object Exercise_2_5 {
  def compose[A, B, C](f: B => C, g: A => B): A => C =
    (a) => f(g(a))
}
