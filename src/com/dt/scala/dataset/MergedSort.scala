package com.dt.scala.dataset



/**
 * Created by HY on 2015/7/13.
 * desc:  List高效排序，倒排序
 */
object MergedSort {
  def main(args: Array[String]) {

    def mergedSort[T](less:(T,T)=> Boolean)(input:List[T]):List[T] = {

      def merge(xList: List[T], yList: List[T]): List[T] =
        (xList,yList) match {
          case (Nil, _) => yList;
          case (_, Nil) => xList;
          case (x::xtail,y::ytail) =>
            if(less(x,y))x::merge(xtail,yList)
            else y::merge(xList,ytail)
        }
      val n = input.length / 2;
      if(n==0){
        input
      }else{
        val (x,y) = input splitAt n;
        merge(mergedSort(less)(x),mergedSort(less)(y))
      }
    }

    println(mergedSort((x:Int, y: Int) => x < y)(List(3,7,9,5)));
    val reversed_mergedSort = mergedSort((x: Int, y: Int) => x > y) _
    println(reversed_mergedSort(List(3,7,9,5)))
  }
}
