package com.dt.scala.type_parameterization

/**
 * Created by HuangYog on 2015/7/17.
 */

/*class Pair_notPerect[T <: Comparable[T]](val first: T, val socend: T){
  def bigger = if(first.compareTo(socend) > 0)first else socend
}*/

class Pair_notPerect[T <% Comparable[T]](val first: T, val socend: T){
  def bigger = if(first.compareTo(socend) > 0)first else socend
}

class Pair_Better[T <% Ordered[T]](val first: T, val socend: T){
  def bigger = if(first > socend)first else socend
}



object View_Bounds {
  def main(args: Array[String]) {

    val pair = new Pair_notPerect("Spark","Hadoop");
    println(pair.bigger);

    val pairInt = new Pair_notPerect(3,5);
    println(pairInt.bigger);

    val pair_Better_String = new Pair_Better("Java","Scala");
    println(pair_Better_String.bigger);

    val pair_Better_Int = new Pair_Better(20,12);
    println(pair_Better_Int.bigger);
  }
}
