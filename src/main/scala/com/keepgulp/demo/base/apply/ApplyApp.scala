package com.keepgulp.demo.base.apply

/**
  * 将会使用伴生对象（Companion Object）为那个特定的类创建实例，而不必使用 new 关键字。
  */
object ApplyApp {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10) {
//      ApplyTest.incr
//    }
//    println(ApplyTest.count) // 10 说明object本身就是一个单例对象

    val b = ApplyTest() // ==> object.apply

    val c = new ApplyTest()
    println(c)
    c()

    //类名() ==> object.apply
    //对象() ==> Class.apply
  }
}

//伴生类和伴生对象
class ApplyTest {
  def apply() = {
    println("Class ApplyTest apply...")
  }
}



object ApplyTest {

  println("Object ApplyTest entry...")

  var count = 0

  def incr = {
    count = count + 1
  }
//最佳实践，在object的方法中去new Class
  def apply() = {
    println("Object ApplyTest apply...")
    //在object中，在apply方法中new 对象
    new ApplyTest()
  }

  println("Object ApplyTest leave...")
}
