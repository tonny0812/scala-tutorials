package com.keepgulp.demo.base

object ConstructorApp {

  def main(args: Array[String]): Unit = {
    var persion = new Person("小黑", 30)
    println(persion.name + ".." + persion.age + ".." + persion.school)

    var persion2 = new Person("小红", 18, "F")
    println(
      persion2.name + ".."
        + persion2.age + ".."
        + persion2.school + ".."
        + persion2.gender
    )
  }
}

//主构造器
class Person(val name: String, val age: Int) {
  println("构造器开始...")
  val school:String = "清华"
  var gender:String = _

  //附属构造器
  def this(name:String, age:Int, gender:String) {
    this(name,age) //附属构造器的第一行代码必须调用主构造器或者其他附属构造器
    this.gender = gender
  }
  println("构造器结束...")
}
