package com.dt.scala.hello

/**
 * Created by HY on 2015/7/3.
 * desc: Scala 继承 超类的结构，重写字段，重写方法
 */

class Person1(val name:String, val age: Int){
  println("The Priamry constructor of Person");

  val school = "BJU";

  def sleep = "8 hours";

  override def toString = "I am a Person !";
}

class Workor(name: String, age: Int, val salary: Long) extends Person1(name,age){
  println("The is the subClass of Person, Primary constructor of Workor ");

  override def toString = "I am a Workor " + super.sleep;
}

object OverrideOperation {
  def main(args: Array[String]) {
    val w = new Workor("Spark", 5, 100000);
    println("School : " + w.school);
    println("Name : " + w.name);
    println("Age : " + w.age);
    println("Salary : " + w.salary);
    println( w.toString);
  }
}
