package com.dt.scala.hello

/**
 * Created by HY on 2015/7/3.
 * desc: Scala 作为接口的trait，在对象中混入trait代码
 */

trait Logger{
// 1. def log(msg: String){}
  def log(msg: String)
}

class ConcreteLogger extends Logger with Cloneable{
  def concreteLog: Unit ={
    log("It's Me !!!");
  }
  override def log(msg: String): Unit = println("Log: " + msg); // 1.
}

trait TraitLogger extends Logger{
  override def log(msg: String): Unit ={
    println("TraitLogger log content is : " + msg);
  }
}

object UseTrait {
  def main(args: Array[String]) {
    // 1. val logger = new ConcreteLogger with TraitLogger
    val logger = new ConcreteLogger
    logger.concreteLog;
  }
}
