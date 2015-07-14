package com.dt.scala.dataset

/**
 * Created by HuangYog on 2015/7/14.
 */
object List_Interal {
  def main(args: Array[String]) {
    val list = List(1,2,3,4,5);
    val listAny: List[Any] = list;
    println(list.isEmpty);
    println(list.head);
    println(list.tail);
    println(list.drop(3));
    println(list.map(_ * 3));
    println(list);
  }
}
