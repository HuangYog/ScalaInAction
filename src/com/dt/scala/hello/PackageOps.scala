package com.dt.scala

import java.awt.{Color,Font}
import java.util.{HashMap => JavaHashMap} //区别名
import scala.{StringBuilder => _}
/**
 * Created by HY on 2015/7/3.
 * desc: 
 */
package PackageOps {

  object PackageOps{
    def main(args: Array[String]) {

    }
  }
  class PackageOps{}

}
package spark.navigation {

  class Navigation
  package tests {

    class NavigationSuite

  }

  package impls{
    class Action extends Navigation{

    }
  }

}

package hadoop {
  package navigation{
    class Navigator
  }

  package launch{


  class Booster{
      val nav = new navigation.Navigator
    }
  }
}

