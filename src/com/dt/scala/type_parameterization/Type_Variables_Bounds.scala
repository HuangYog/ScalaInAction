package com.dt.scala.type_parameterization

/**
 * Created by HuangYog on 2015/7/14.
 */

class Pair[T <: Comparable[T]](val first: T, second: T){//“<:” 表示T必须是Comparable[T]的子类
  def bigger = if(first.compareTo(second) > 0) first else second;
}

class Pair_Lower_Bound[T](val first: T, val second: T){
  def replaceFirst[R >: T](newFirst: R) = new Pair_Lower_Bound[R](newFirst,second);
  //R是T 的上界(父类)
}


object Type_Variables_Bounds {

  def main(args: Array[String]) {
    val pair = new Pair("Spark", "Hadoop");
    println(pair.bigger);

    val bound = new Pair_Lower_Bound("Spark", "Hadoop");
    println(bound.replaceFirst().second)
  }
}
