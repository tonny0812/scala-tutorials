package com.keepgulp.demo.base

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    var people = new People()
    people.name = "小白"
    println(people.name + ".." + people.age)

    println(people.eat())

    people.watchGame()

//    println(people.gender)

    people.printInfo()
  }
}

class People {
  //定义属性
  var name:String = _
  val age:Int = 10
  private val gender = "male"

  //定义方法
  def eat():String = {
    name + "is eating..."
  }

  def watchGame(ateamName:String="中国队", bteamName:String="波兰队"): Unit = {
    println(name + " is watching the game：" + ateamName + "VS" + bteamName + "  😭。。。")
  }

  def printInfo(): Unit = {
    println(name + ".." + age + ".." + gender)
  }
}
