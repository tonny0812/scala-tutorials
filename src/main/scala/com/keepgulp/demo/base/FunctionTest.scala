package com.keepgulp.demo.base

object FunctionTest {

  def main(args: Array[String]): Unit = {
    println(sum(1, 2))
  }

  def sum(a: Int, b: Int) = {
    a + b //不需要return，最后一行就是返回值
  }

  //默认参数，主要用于设定默认值，比如一些配置参数等
  def sayName(name: String = "zhangsan"): Unit = {
    println("name is " + name)
  }

  //命名参数，指定参数名称，与参数顺序无关
  def speed(distance: Float, time: Float): Float = {
    distance / time
  }

  def sum2(numbers: Int*): Int = {
    var resutl = 0
    for (n <- numbers) {
        resutl += n
    }
    resutl
  }

  def conditionTest(number: Int = 11) = {
    println("if条件语句")
    if (number > 10) {
      println("Number>10")
    } else if (number == 0) {
      println("Number is zero.")
    } else {
      println("Other")
    }

  }

  // 循环表达式
  def forTest(): Unit = {
    //for表达式
    println("一个简单的for循环从1到5")

    for (i <- 1 to 5) {
      println(s"Number: $i")
    }

    println("一个简单的for循环从1到5，其中15不包含")
    for (i <- 1 until 15) {
      println(s"Number: $i")
    }

    for (i <- 1 until 15 if i%2 == 0) {
      println(s"Number: $i")
    }

    val arr = Array("a", "b", "c", "d", "e")
    for(str <- arr) {
      println(str)
    }

    // => 将左边的元素作用上右边的函数
    arr.foreach(str => println(str))
  }

  def whileTest() ={
    var (number, sum) = (100, 0)
    while(number > 0) {
      sum += number
      number = number -1
    }
    println(sum)
  }
}
