package com.dt.scala.pattern_match

/**
 * Created by HuangYog on 2015/7/7.
 */
object Pattern_Match_More {
  def main(args: Array[String]) {

    def match_type(t: Any) = t match {
      case p: Int => println("It is Integer");
      case p: String => println("It is String");
      case m: Map[_, _] => m.foreach(println);
      case _ => println("Unknown type!"); //其他的情况
    }

    match_type(2);
    match_type(Map("Scala" -> "Spark"));

    def match_array(arr: Any) = arr match {
      case Array(0) => println("Array 0");
      case Array(x, y) => println("Array " + " " + y);
      case Array(0, _*) => println("Array 0...");
      case _ => println("Something else");
    }

    match_array(Array(0));
    match_array(Array(0,1));
    match_array(Array(0,1,2,3,4,5));


    def match_list(lst: Any) = lst match {
      case 0:: Nil => println("List: " + "0");
      case x:: y :: Nil => println("List: " + x +" " + y);
      case 0:: tail => println("List: " + "0");
      case _ => println("Something else");
    }

    match_list(List(0));
    match_list(List(0,1));
    match_list(List(0,1,2,3,4,5));

    def match_tuple(tuple: Any) = tuple match {
      case (0, _) => println("Tuple 0");
      case (x, 0) => println("Tuple "+ x);
      case _ => println("Something else");
    }

    match_tuple((0,"Scala"));
    match_tuple((0,2));
    match_tuple((0,1,2,3,4,5));
  }
}
