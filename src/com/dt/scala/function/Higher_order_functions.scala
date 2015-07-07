package com.dt.scala.function

/**
 * Created by HY on 2015/7/7.
 * desc: Scala 高级函数
 */
object Higher_order_functions {

  def main(args: Array[String]) {

    //function_f2;
    function_f1;
  }

  def function_f2: Unit ={
    (1 to 9).map("*" * _).foreach(println(_));
    (1 to 9).filter(_ % 2==0).foreach(println);

    var str = ""
    var i = 0;
    (1 to 9).reduceLeft(test(_,_));

    def test(x:Int, y:Int): Int ={
      if(i > 0){
        str += "*"+y;
      } else str += x+"*"+y;
      i += 1 ;
      x * y;
    }
    println(str)


    "Spark is the most exciting thing happening in big data today".split(" ")
      .sortWith(_.length > _.length).foreach(println _);
  }

  def function_f1(): Unit ={
    val fun = Math.ceil _ ;
    val num = 3.14;
    fun(num)
    Array(3.14, 1.42, 2.0).map(fun);

    val triple = (x: Double) => 3 * x;
    Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x);
    Array(3.14, 1.42, 2.0).map{(x: Double) => 3 * x};

    def high_order_functions(f: (Double) => Double) = f(1.25);
    println(high_order_functions(Math.ceil _)+" _1_");
    println(high_order_functions(Math.sqrt _)+" _2_");

    def mulBy(factor: Double) = (x: Double) => factor * x;
    val quintuple = mulBy(5);
    println(quintuple(20)+" _3_");

    println(high_order_functions((x: Double) => 3 * x)+" _4_");
    high_order_functions((x) => 3 * x);
    high_order_functions(x => 3 * x);
    high_order_functions(3 * _);

    val fun2 = 3 * (_: Double);
    val fun3:(Double) => Double = 3 * _



  }
}
