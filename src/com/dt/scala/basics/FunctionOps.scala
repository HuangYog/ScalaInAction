package com.dt.scala.basics

import scala.io.Source

/**
 * Created by HuangYog on 2015/7/6.
 */
object FunctionOps {

  def main(args: Array[String]) {
    val width = args(0).toInt;
    for(arg <- args.drop(1)){
      processData(arg,width);

      var increase = (x: Int) => x + 1;
      increase(10);
      increase = (x: Int) => x + 9999;

      val someNumbers = List(-11,-10,-5,0,5,10);
      someNumbers.foreach((x: Int) => println(x));
      someNumbers.filter((x: Int) => x>0);
      someNumbers.filter((x)=>x>0);
      someNumbers.filter(x=>x>x);
      someNumbers.filter(_ > 0);
      val f = (_:Int) + (_:Int);
      println(f(5,10));
    }
  }


  /* 强内聚若耦合 */
  def processData(fileName: String, width: Int): Unit ={
    def processLine(line: String): Unit ={
      if(line.length > width){
        println(fileName + " : " + line);
      }

      val source = Source.fromFile(fileName);
      for(line <- source.getLines()){
        processLine(line);
      }
    }
  }
}
