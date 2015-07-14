package com.dt.scala.type_parameterization

import scala.reflect.ClassTag

/**
 * Created by HuangYog on 2015/7/14.
 */

class Triple[F, S, T](val first: F, val second: S, val third: T);

object Hello_Type_Parmeterization {
  def main(args: Array[String]) {

    val triple = new Triple("Spark",3,3.1415);
    val bigData = new Triple[String, String, Char]("Spark", "Hadoop", 'R');

    def getData[T](list: List[T]) = list(list.length / 2);
    println(getData(List("Spark","Hadoop",'R')))
    val f = getData[Int] _;
    println(f(List(1,2,3,4,5,6,7,8)));

    def biuldArray[T: ClassTag](len: Int) = new Array[T](len);
    println(biuldArray[Int](5).toList)

  }
}
