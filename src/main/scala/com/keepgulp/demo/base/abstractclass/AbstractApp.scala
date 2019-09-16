package com.keepgulp.demo.base.abstractclass

//抽象
object AbstractApp {

  def main(args: Array[String]): Unit = {

    var person = new Person2 {
      override def speak: Unit = println(s"$name $age")

      override val name: String = "张三"
      override val age: Int = 20
    }

    person.speak

    var student= new Student2()
    student.speak
  }
}

/**
  * 类的一个或多个方法没有完整的实现（只有定义，没有实现）
  */

abstract class Person2 {
  def speak

  val name:String
  val age:Int
}

class Student2() extends Person2 {
  val school = "北大"

  override def speak: Unit = println(s"$name, $age, $school")

  override val name: String = "小明"
  override val age: Int = 18
}
