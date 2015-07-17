package com.dt.scala.type_parameterization

/**
 * Created by HuangYog on 2015/7/17.
 */

class Pair_Ordering[T: Ordering] (val first: T, val second: T){
  def bigger(implicit ordered: Ordering[T]) = {
    if(ordered.compare(first,second) > 0) first else second;
  }
}

object Context_Bounds {
  def main(args: Array[String]) {

    val pair = new Pair_Ordering("Spark","Hadoop");
    println(pair.bigger);

    val pair_Int = new Pair_Ordering(3,5);
    println(pair_Int.bigger)

  }
}
