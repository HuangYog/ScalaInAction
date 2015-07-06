package com.dt.scala.hello

/**
 * Created by HuangYog on 2015/6/30.
 */
object For_Function_Advanced {
  def main(args: Array[String]) {
    //for(i <- 1 to 2; j <- 1 to 3) println((100 * i + j) + "   ");
    /*for(i <- 1 to 2; j <- 1 to 2 if(i != j)) print((100 * i + j) + "   ");
    println*/


    /*def addA(x : Int) = x+100;
    val add = (x : Int) => x + 200; // 匿名函数
    println("addA = "+addA(1)+"   add = " + add(2));*/

    /* 函数递归调用 */
    /*def fac(n:Int) : Int = if(n <= 0) 1 else n * fac(n - 1);
    println("The Result from a fac is : " + fac(5));*/

    /* 默认参数 */
    /*def combine(content:String, left:String = "[",rigth:String = "]" )
        = left + content + rigth;
    println("The result from a combine is " + combine("I Love Spark ","<<"));*/


    /* 函数可变参数 */
    def connected(args: Int*) = {
      var result = 0;
      for(arg <- args)result += arg;
      result;
    }
    println("The result from a connected is : " + connected(1,2,3,4));
    println("The result from a connected is : " + connected(1,2,3,4,5,6,7));

  }
}
