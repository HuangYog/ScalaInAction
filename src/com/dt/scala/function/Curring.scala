package com.dt.scala.function

/**
 * Created by HY on 2015/7/7.
 * desc:  Curring
 */
object Curring {
  def main(args: Array[String]) {
    def multiple(x: Int, y: Int) = x * y;
    def multipleOne(x: Int) = ( y: Int) => x * y;
    println(multipleOne(3)(4));

    def curring(x: Int)(y: Int) = x * y ;
    println(curring(3)(4));
    val a = Array("Hello","Spark");
    val b = Array("hello","spark");

    println(a.corresponds(b)(_.equalsIgnoreCase(_)));// 不关大小写的equa;
  }
}
