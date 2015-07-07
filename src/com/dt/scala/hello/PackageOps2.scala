package com.dt.scala.hello

/**
 * Created by HY on 2015/7/3.
 * desc: Scala 包，类，对象，成员，伴生类，伴生对象的访问权限
 */
object PackageOps2 {

}

package spark{
  package navigation{

  private[spark] class Navigator{
      protected[navigation] def useStarChart(){}
      class LegOfjourney{
        private[Navigator] val distance = 100
      }

      private[this] var speed = 200
    }
  }

  package launch {
    import navigation._
    object Vehicle {
      private[launch] val guide = new Navigator()
    }

    class PackageOps_Advanced{

      import PackageOps_Advanced.power
      private def canMakeItTrue = power > 1111
    }

    object PackageOps_Advanced{
      private def power = 10000;

      def makeItTrue(p: PackageOps_Advanced):Boolean = {
        val result = p.canMakeItTrue
        result;
      }
    }
  }
}
