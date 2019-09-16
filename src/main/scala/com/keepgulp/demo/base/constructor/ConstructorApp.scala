package com.keepgulp.demo.base.constructor

//构造器
object ConstructorApp {

  def main(args: Array[String]): Unit = {
//    var persion = new Person("小黑", 30)
//    println(persion.name + ".." + persion.age + ".." + persion.school)
//
//    var persion2 = new Person("小红", 18, "F")
//    println(
//      persion2.name + ".."
//        + persion2.age + ".."
//        + persion2.school + ".."
//        + persion2.gender
//    )

    var student = new Student("小明", 18, "Math")
    println(student.name + ".." + student.age + ".." + student.major)
    println(student.toString)
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

//继承
class Student(name:String, age:Int, var major:String) extends Person(name, age) {
  println("Person Student enter...")

  println("Person Student leave...")

  //重写
//  override val school = "北大"
  override def toString = s"Student(name=$name, age=$age, school=$school, major=$major)"
}
