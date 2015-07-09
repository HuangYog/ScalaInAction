package com.dt.scala.pattern_match

/**
 * Created by HuangYog on 2015/7/9.
 */

abstract class Item
case class Book(description: String, price: Double) extends Item
case class Bundle(description: String, price: Double, item: Item*) extends Item


object Pattern_Match_Case_Class_Nested {
  def main(args: Array[String]) {
      def caseClass_Nested(person: Item) = person match {
        //case Bundle(_, _, art @ Book(_, _), rest @ _*) => println(art.description + " : " + art.price);
        case Bundle(_, _, Book(descr, _), _*) => println("The frist descr is :" + descr);
        case _ => println("Oops!");

      }

    caseClass_Nested(Bundle("1111 Special`s ", 30.1,
      Book("Scala for the Spark Developer", 69.35),
      Bundle("Hadoop", 40.0,
        Book("Hive", 79.9),
        Book("HBase",78.3)
      )
    ))

    caseClass_Nested(Bundle("1222 Special`s",35.4,
      Book("Spark for the Impatient ",89.7)));
  }
}
