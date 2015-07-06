package com.dt.scala.oop

/**
 * Created by HuangYog on 2015/7/1.
 * DESC：类的半身对象
 *
 */
object ObjectOps {
  def main(args: Array[String]) {
    println(University.newStudentNo);
    println(University.newStudentNo);
  }

}

class University{
  val id = University.newStudentNo;
  private var number = 0;
  def aClass(number: Int): Unit = {
    this.number += number;
  }
}
object University{
  /* 类的成员在该类以外为地方使用时不能定义成 private类型 */
  var studentNo = 0;
  def newStudentNo = {
    studentNo += 1;
    studentNo
  }
}


