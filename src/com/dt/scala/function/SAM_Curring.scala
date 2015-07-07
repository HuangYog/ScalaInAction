package com.dt.scala.function

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

/**
 * Created by HY on 2015/7/7.
 * desc: SAM转换
 */
object SAM_Curring {
  def main(args: Array[String]) {

    val frame = new JFrame("SAM Testing");
    val jButton = new JButton("Counter");
    javaStyle(jButton);
    scalaStyle(jButton);
    frame.setContentPane(jButton);
    frame.pack();
    frame.setVisible(true);
  }

  def javaStyle(jButton: JButton): Unit ={
    var data = 0;
    jButton.addActionListener(new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = {
        data += 1;
        println(data);
      }
    });

  }

  def scalaStyle(jButton: JButton): Unit ={
    var data = 0;
    implicit  def convertedAction(action: (ActionEvent) => Unit )= {
      new ActionListener {
        override def actionPerformed(e: ActionEvent): Unit = {
          action(e);
        }
      }
    }
    jButton.addActionListener((event: ActionEvent) =>{ data += 1; println(data)});
  }
}
