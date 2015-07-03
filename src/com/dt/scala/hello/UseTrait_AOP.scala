package com.dt.scala.hello

/**
 * Created by HY on 2015/7/3.
 * desc: Scala 多重继承，多重继承构造器执行顺序及AOP的实现
 */

// 多重继承
class Human{
  println("Human");
}

trait TTeacher extends Human{
  println("TTeacher");
  def teach();// 抽象方法
}

trait PianoPlayer extends Human{
  println("PianoPlayer ");
  def playPiano = {println("I am playing piano. So Much")}
}

class PianoTeacher extends Human with TTeacher with PianoPlayer{
  override def teach = {println("I am training students")};
}


object UseTrait_AOP {

  /*def main(args: Array[String]) {

    val t1 = new PianoTeacher
    t1.playPiano
    t1.teach

    val t2 = new Human  with PianoPlayer with TTeacher {
      def teach = {println("I am teaching students!!!")}
    }
    t2.playPiano
    t2.teach
  }*/


  def main(args: Array[String]) {
    val w = new Work with TBeforeAfter
    w.doAction
  }

}

//AOP
trait Action{
  def doAction
}

trait TBeforeAfter extends Action{
  abstract override  def doAction: Unit ={
    println("Initialzation");
    super.doAction
    println("Destroyed");
  }
}

class Work extends Action{
  override def doAction = println("Working...");
}

