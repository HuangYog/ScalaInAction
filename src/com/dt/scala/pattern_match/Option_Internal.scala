package com.dt.scala.pattern_match

/**
 * Created by HuangYog on 2015/7/9.
 */
object Option_Internal {

  def main(args: Array[String]) {

    val scores = Map("Alice" -> 99, "Spark" -> 100)

    scores.get("Alice") match {
      case Some(score) => println(score);
      case None => println("No score");

    }
  }
}
