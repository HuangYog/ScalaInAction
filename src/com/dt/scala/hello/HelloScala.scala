package com.dt.scala.hello

/**
 * Created by HY on 2015/6/30.
 * desc: 
 */
object HelloScala {
  def main(args: Array[String]) {
    println("Hello Scala An World!");
    for(arg <- args){
      println(arg);
    }
  }
}
