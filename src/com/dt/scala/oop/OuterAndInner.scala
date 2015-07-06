package com.dt.scala.oop

/**
 * Created by HuangYog on 2015/7/1.
 */

class Outer(val name: String){outer =>
  class Inner(val name: String){
    def foo(b:Inner) = println("Outer: " + outer.name + "  Inner: " + b.name);
  }
}


object OuterAndInner {
  def main(args: Array[String]) {
    val outer1 = new Outer("Spark");
    val outer2 = new Outer("Hadoop");

    /**
     * 内部类隶属于外部类实例本身
     */
    val inner1 = new outer1.Inner("Scala");
    val inner2 = new outer2.Inner("Java");
    inner1.foo(inner1);
    inner2.foo(inner2);
  }
}
