package com.dt.scala.oop

/**
 * Created by HuangYog on 2015/7/1.
 */
object HelloOOP {

  def main(args: Array[String]) {
    /*val person = new Person();
    person.increment();
    println(person.current);
    person.increment();
    println(person.current); */

    val student = new Student();
    println(student.age);
  }
}

class Person{
  private  var age = 0;
  def increment(){age += 1}
  def current = age;
}

class Student{
  //private[this] var privateAge = 0;
  private var privateAge = 0;
  var name = "Scala";
  var age = 0;
  /* 在方法中访问了对象的私有属性，是合法的，如果该属性定义成 private[this]
  * 则不能访问对象的私有属性，这就是传说中的对象私有属性，很重要*/
  def isYounger(other:Student) = privateAge < other.privateAge
}
