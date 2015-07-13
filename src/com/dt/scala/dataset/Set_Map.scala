package com.dt.scala.dataset

import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
 * Created by HuangYog on 2015/7/13.
 */
object Set_Map {
  def main(args: Array[String]) {
    val data = mutable.Set.empty[Int];
    data ++= List(1,2,3);
    data += 4;
    data --= List(2,3);
    println(data);
    data += 1;
    println(data); //因为set是不可重复的所以data += 1; 后set中还是只有1，4
    data.clear();// 清楚set中的元素
    println(data);

    val map = mutable.Map.empty[String,String];
    map("Java") = "Hadoop";
    map("Scala") = "Spark";
    println(map);
    println(map("Scala"));

    // treeMap 和treeeSet会自动对元素进行排序
    val treeSet = mutable.TreeSet(9,3,1,8,0,2,7,4,6,5);
    println(treeSet);
    val treeSetForChar = mutable.TreeSet("Spark","Scala","Hadoop");
    println(treeSetForChar);

    var treeMap = TreeMap("Scala"->"Spark","Java"->"Hadoop"); //treeMap 是不可变的immutable
    println(treeMap);
  }
}
