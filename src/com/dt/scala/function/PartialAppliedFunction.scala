package com.dt.scala.function

/**
 * Created by HY on 2015/7/7.
 * desc: Scala 的偏函数
 */
object PartialAppliedFunction {
  def main(args: Array[String]) {
    val data = List(1,2,3,4,5,6);
    /* 循环遍历每个元素并打印出来 */
    data.foreach(print _ );
    println;
    data.foreach(x => print(x + "_"));
    println;

    def sum(a:Int, b: Int, c: Int) = a + c + b;
    println(sum(1,2,3) + " ___ ");

    val fp_a = sum _;
    println(fp_a(1,2,4));
    println(fp_a.apply(1,2,3));
    val fp_b = sum(1, _: Int, 3);
    println(fp_b(2));
    println(fp_b(10));


    data.foreach(println _);
    data.foreach(println);
  }
}
