package com.dt.scala.basics

import java.io.PrintWriter

import scala.io.Source

/**
 * Created by HuangYog on 2015/7/6.
 * DESC：Scala 文件操作 流
 */
object FileOps {
  def main(args: Array[String]) {
//    readFile();
//    readUrl();
//    wirteFile("本期内容：\n1 文件的读取、写入操作代码实战\n2 控制台操作代码实战");
    readConsole()
  }

  /**
   * 文件操作
   */
  def readFile(): Unit ={
    val file = Source.fromFile("D:\\aaa.txt");
    for(line <- file.getLines()){
      println(line);
    }
    file.close();
  }

  /**
   * 获取URL地址的内容
   */
  def readUrl(): Unit ={
    val webFile = Source.fromURL("http://blog.sina.com.cn/s/blog_535aa0930100bo3c.html");
    webFile.foreach(print);
    webFile.close();
  }

  /* 文件写入内容（完全擦除再写入） */
  def wirteFile(content : String): Unit ={
    val wirter = new PrintWriter("aaa.txt");
    wirter.println(content);
    wirter.close();

  }

  def readConsole(): Unit ={
    print("Please enter your input: ");
    val line = Console.readLine();
    println("Thanks you just typed: " + line);
  }
}
