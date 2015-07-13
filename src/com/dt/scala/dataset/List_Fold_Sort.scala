package com.dt.scala.dataset

/**
 * Created by HY on 2015/7/13.
 * desc: 
 */
object List_Fold_Sort {
  def main(args: Array[String]) {
    println((1 to 100).foldLeft(0)(_+_));
    println((0 /: (1 to 100))(_+_));

    println((1 to 5).foldRight(100)(_-_));
    println(((1 to 5):\100)(_-_));

    println(List(1,-3,4,3,6) sortWith(_<_));
    println(List(1,-3,4,3,6) sortWith(_>_));

  }
}
