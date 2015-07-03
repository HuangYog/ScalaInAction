package com.dt.scala.hello

/**
 * Created by HY on 2015/7/3.
 * desc: 
 */

class ApplyTest{
  def apply() = println("I am into Spark so much !!!");

  def haveATry{
    println("Have a try on apply !");
  }
}

object ApplyTest{
  def apply() = {
    println("I am Into Scala so much !!!");
    new ApplyTest;
  }
}

object ApplyOperation {

  def main(args: Array[String]) {
    val array = Array(1,2,3,4,5);  // 这里调用的也是apply
    val a = ApplyTest(); // 这里是直接调用object ApplyTest 的apply，如果是new ApplyTest 则调用的class 的ApplyTest
    a.haveATry
  }

}
