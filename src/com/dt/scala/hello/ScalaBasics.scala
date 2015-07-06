package com.dt.scala.hello

/**
 * Created by HuangYog on 2015/6/30.
 */
object ScalaBasics {
  def looper(x : Long, y : Long) : Long = {
    var a = x;
    var b = y;
    while (a != 0){
      var temp = a;
      a = b % a;
      b = temp;
    }
    b;
  }

  def main(args: Array[String]) {

    println(looper(100,198));
  }
}
