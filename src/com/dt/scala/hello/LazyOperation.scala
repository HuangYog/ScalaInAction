package com.dt.scala.hello

import scala.io.Source

/**
 * Created by HuangYog on 2015/6/30.
 */
object LazyOperation {
  def main(args: Array[String]) {
    lazy val file = Source.fromFile("D:\\aa.txt"); //正确的文件地址是D:\\aaa.txt
    println("Scala");
    for(line <- file.getLines()) println(line); // 如果注释掉这行就不回报错，懒加载
  }
}
