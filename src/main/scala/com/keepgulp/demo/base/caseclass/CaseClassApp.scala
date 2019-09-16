package com.keepgulp.demo.base.caseclass

// 通常用在模式匹配
object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("旺财").name)
  }
}

//case class不用new
//case class 将会自动的创建 apply(),  toString(), hashCode 和 equals() 方法.
case class Dog(name:String)
