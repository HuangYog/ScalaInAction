package com.dt.scala.hello

import java.io.File

/**
 * Created by HuangYog on 2015/6/30.
 * DESC: Scala 的流程控制。
 */
object ProcessControl {
  def main(args: Array[String]) {
/****************************************************/
    var file = "scala.xml";
    if(!args.isEmpty) file = args(0);
    println("YI:"+file);

    /* 三元表达式 */
    val file1 = if (!args.isEmpty) args(0) else "scala.xml";
    println("YIYIYIYI:"+file1);

/****************************************************/

/****************************************************/

    for(i <- 0 to 10){
      println("Number is : " + i);
    }
/****************************************************/
  }

/****************************************************/

  val files = (new File(".")).listFiles();
  for(f <- files){
    println("当前目录：" + f);
  }
  testException;
/****************************************************/

  def testException(): Unit ={
  var x = 99;
  try {
    val half = if(x % 2 == 0) x / 2 else throw new RuntimeException("N must be event");
  }catch {
    case e : Exception => println("The exception is :" + e.getMessage);
  }

}

}


