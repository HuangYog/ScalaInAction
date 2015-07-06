package com.dt.scala.basics

/**
 * Created by HuangYog on 2015/7/6.
 */
object RegExpressOps {
  def main(args: Array[String]) {

    /**
     *  三个引号表示里面的都是原生符号，不需转义，
     *  .r表示regex
     */
    val regex = """([0-9]+) (a-z)""".r;
    val numPattern = """\s+[0-9]+""".r;
    val numberPatern = """\s+[0-9]+\s""".r;

    for(matchString <- numberPatern.findAllIn("99345 Scala, 22298 Spark")){
      println(matchString);
    }

    println(numberPatern.findFirstIn("99ss java, 222 hadoop"));

    val numitemPattern = """([0-9]+) ([a-z]+)""".r;
    val numitemPattern(num,item) = "99 hadoop";


    /* 模式匹配 */
    val line = "93459 spark";
    line match {
      case numitemPattern(num,blog) => println(num + "\t" + blog);
      case _ => println("ohh...");
    }
  }
}
