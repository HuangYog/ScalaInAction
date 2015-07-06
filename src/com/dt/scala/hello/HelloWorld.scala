package com.dt.scala.hello

/**
 * Created by HuangYog on 2015/6/30.
 */
object HelloWorld {

  def doWhile(): Unit ={
    var line = "";
    do {
      line = readLine();
      println("Read: " + line);
    } while(!"".equals(line))
  }
  def main(args: Array[String]) {
    /*println("OK");
    for(arg <- args){
      println("OK"+arg);
    }*/

    doWhile();
    //println(ScalaBasics.looper(100,198));
  }
}
