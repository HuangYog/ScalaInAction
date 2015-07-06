package com.dt.scala.oop

/**
 * Created by HuangYog on 2015/7/1.
 */
object OOPInScala {
  /** 1.
   *
   */
  /*def main(args: Array[String]) {
    val teacher = new Teacher();
    teacher.name = "Scala";
    teacher.sayHello();
  }*/

  def main (args: Array[String]) {
    val teacher = new Teacher("Spark",2,"male");
    //teacher.gender = "male";
    println(teacher.age);
  }
}

/**  1.
 * 类自身带有构造器 class Teacher(){}
 */
/*class Teacher() {
  var name: String = _; // 初始化值使用占位符_
  private var age = 24;
  private[this] val gender = "male";

  def this(name: String){
    this ;
    this.name;
  }

  def sayHello(): Unit ={
    println(this.name+" : " + this.age +" : " + this.gender);
  }
}*/

/**
 * 带参数的类会产生带参数的构造函数
 * 如果该不想让别人调用默认构造器可以在class Teacher 后加上 private
 */
class Teacher(val name: String, val age: Int){
  println("This is the primary constructor !!!");
  var gender: String = _;
  println(gender);
  def this(name: String,age: Int,gender: String){
    this(name,age);
    this.gender = gender;
  }
}