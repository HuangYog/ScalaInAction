package com.dt.scala.dataset

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * Created by HuangYog on 2015/7/13.
 * DESC: ListBuffer , ArrayBuffer,Queue,Stack
 */
object ListBuffer_ArrayBuffer_Queue_Stack {
  def main(args: Array[String]) {
    import scala.collection.mutable.ListBuffer  // mutable 可变的集合
    val listBuffer = new ListBuffer[Int];
    listBuffer +=1;
    listBuffer +=2;
    println(listBuffer);

    import scala.collection.mutable.ArrayBuffer
    val arrayBuffer = new ArrayBuffer[Int];
    arrayBuffer +=1;
    arrayBuffer +=2;
    println(arrayBuffer);

    val empty = Queue[Int](); // immutable 不可变的集合
    val queue1 = empty.enqueue(1);
    val queue2 = queue1.enqueue(List(2,3,4,5));
    println(queue2);
    val (element,left) = queue2.dequeue;
    println(element+ " : "+left);


    import scala.collection.mutable.Queue
    val queue = new Queue[String]();
    queue +="a";
    queue ++= List("b","c");
    println(queue);
    println(queue.dequeue());
    println(queue);

    val stack = new mutable.Stack[Int];
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    println(stack.top);
    println(stack);
    println(stack.pop);
    println(stack);
  }
}
