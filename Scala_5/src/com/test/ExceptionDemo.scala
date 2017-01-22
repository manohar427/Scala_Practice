package com.test

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object ExceptionDemo {

  def main(arg: Array[String]) {
    try {
      val f = new FileReader("sample.doc")
    } catch {
      case e: FileNotFoundException => {
        println("Missing file exception:" + e.getMessage)
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
}