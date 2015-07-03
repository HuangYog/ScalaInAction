package com.dt.scala.hello

/**
 * Created by HY on 2015/7/3.
 * desc: Scala 抽象类抽象字段 抽象方法
 */

class AbstractClassOps{
  var id: Int = _;
}

abstract class SuperTeacher(val name: String){
  var id: Int;//没有初始化自动定义成抽象字段
  var age: Int;
  def teach();//没有实现方法体自动定义成抽象方法
}

class TeacherForMath(name:String) extends SuperTeacher(name){
  override var id: Int = name.hashCode();

  override def teach(): Unit = {
    println("Teaching!!!");
  }

  override var age: Int = 24;
}

object AbstractClassOps {
  def main(args: Array[String]) {
    val teacher = new TeacherForMath("Spark");
    teacher.teach();

    println("teacher.id " + teacher.id);
    println("teacher.name " + teacher.name);
    println("teacher.age " + teacher.age);
  }
}
