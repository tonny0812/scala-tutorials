package com.keepgulp.demo.base.`trait`

/**
  * 定义消费类应该实现的方法,有点类似实现interface
  */
object TraitApp {
  def main(args: Array[String]): Unit = {
    val person1 = new Person1()
    person1.add("张三")
    person1.update("张三")
    person1.search("张三")
    person1.delete("张三")

    val person2 = new Person2()
    person2.add("李四")
    person2.update("李四")
    person2.search("李四")
    person2.check("李四")
    person2.delete("李四")
  }
}

//使用trait关键字创建一个trait
trait PersonDao {

  def add(name: String): Long

  def update(name: String): Boolean

  def search(name: String): String

  def delete(name: String): Boolean

}

trait PersonDao2 {
//  def add(name: String): Unit

  def check(name: String): Boolean
}

//利用extends关键字,实现这些方法
class Person1 extends PersonDao {

  override def add(name: String): Long = {
    println(s"Person1-> add method -> name: $name")
    1
  }

  override def update(name: String): Boolean = {
    println(s"Person1-> update method -> name: $name")
    true
  }

  override def search(name: String): String = {
    println(s"Person1-> search method -> name: $name")
    name
  }

  override def delete(name: String): Boolean = {
    println(s"Person1-> delete method -> name: $name")
    true
  }
}

class Person2 extends PersonDao with PersonDao2 {

  override def add(name: String): Long = {
    println(s"Person2-> add method -> name: $name")
    1
  }

  override def update(name: String): Boolean = {
    println(s"Person2-> update method -> name: $name")
    true
  }
  override def search(name: String): String = {
    println(s"Person2-> search method -> name: $name")
    name
  }

  override def delete(name: String): Boolean = {
    println(s"Person2-> delete method -> name: $name")
    true
  }

  override def check(name: String): Boolean = {
    println(s"Person2-> check method -> name: $name")
    true
  }
}