package com.dt.scala.hello

/**
 * Created by HuangYog on 2015/6/30.
 * DESC:元组
 */
object TuleOps {
  def main(args: Array[String]) :Unit = {
    val triple = (100,"Scala","Spark");
    println(triple._1);
    println(triple._2);
    println(triple._3);
  }
}
