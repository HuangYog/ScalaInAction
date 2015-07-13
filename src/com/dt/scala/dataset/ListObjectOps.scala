package com.dt.scala.dataset

/**
 * Created by HY on 2015/7/13.
 * desc: 
 */
object ListObjectOps {
  def main(args: Array[String]) {
    println(List.apply(1,2,3)); // 调用toList
    println(List.make(3,9));// 重复同类型的对象 3 重复九次
    println(List.range(1,5)); //左闭右开
    println(List.range(9,1,-3)); //

    val zipped = "abcde".toList zip List(1,2,3,4,5);
    println(zipped);
    println(zipped.unzip); // zip的反操作

    println(List(List('a','b'),List('c','b'),List('d','e')).flatten); //将所有的list组成一个list
    println(List.concat(List('b'),List('b'),List('c'))); // 和flatten一样，

    println(List.map2(List(10,20),List(10,10)) (_ * _));// 得到一个新list（10*10,20*10）
  }
}
