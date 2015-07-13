package com.dt.scala.pattern_match

import com.dt.scala.dataset
import com.dt.scala.dataset.HelloList

/**
 * Created by HY on 2015/7/13.
 * desc: 
 */
object HelloList {
  def main(args: Array[String]) {
    val bigData = List("Hadoop","Spark");
    val data = List(1,2,3);

    val bigData_Core = "Hadoop" :: ("Spark" :: Nil);
    val data_Int = 1 :: 2 :: 3 :: Nil;

    println(data.isEmpty);
    println(data.head);
    println(data.tail.head);

    val List(a,b) = bigData;
    println("a : " + a + " === " + " b : " + b);
    val x :: y :: rest = data;
    println("x : " + x + " === " + " y: " + y + " === " + rest);
    val shuffledData = List(6,3,5,2,9,1);
    println(dataset.HelloList.sortList(shuffledData));


  }
}
