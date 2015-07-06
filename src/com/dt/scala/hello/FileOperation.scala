package com.dt.scala.hello

import scala.io.Source

/**
 * Created by HuangYog on 2015/6/30.
 * DESC：文件操作
 */
object FileOperation {
  def main(args: Array[String]) {
    val file1 = Source.fromFile("D:\\aaa.txt");
    val file2 = Source.fromURL("http://spark.apache.org/");
    for(file <- file1.getLines()){
      println(file);
    }
    for(file <- file2.getLines()){
      println(file);
    }
  }
}
