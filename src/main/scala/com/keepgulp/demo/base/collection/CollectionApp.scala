package com.keepgulp.demo.base.collection

import scala.collection.immutable.ListSet

/**
  * 不可变集合：List, ListSet, ListMap, Map, HashMap, TreeMap, Queue, Sequence, Set, HashSet, TreeSet, SortedSet, BitSet, Stack, Stream, Vector
  *
  * 可变集合:Array, ArrayBuffer, ArrayStack, ListBuffer, Map, HashMap, ListMap, LinkedHashMap, Queue, PriorityQueue, Set, HashSet, SortedSet, TreeSet, LinkedHashSet, BitSet
  */
object CollectionApp {

  def main(args: Array[String]): Unit = {
//    listTest
    listSetTest
  }

  def listTest(): Unit = {
    val list1: List[String] = List("一", "二", "三")
    println("1、打印list")
    println(s"Elements of list1 = $list1")
    println("2、打印list元素")
    println(s"Element at index 0 = ${list1(0)}")
    println(s"Element at index 1 = ${list1(1)}")
    println(s"Element at index 2 = ${list1(2)}")
    println("3、使用 :+ 添加元素到List的末尾")
    val list2: List[String] = list1 :+ "四"
    println(s"list :+ = $list2")
    println("4、使用 +: prepend元素在List的首部")
    val list3: List[String] = "五" +: list1
    println(s"list +: = $list3")
    println("5、使用 :: 合并两个两个List")
    val list4: List[Any] = list1 :: list2
    println(s"list1 :: list2 = $list4")
    println("6、使用 ::: 合并两个两个List")
    val list5: List[String] = list1 ::: list2
    println(s"list1 ::: list2 = $list5")
    println("7、初始化一个空的List")
    val emptyList: List[String] = List.empty[String]
    println(s"Empty list = $emptyList")
  }

  def listSetTest(): Unit = {
    val listSet1: ListSet[String] = ListSet("一", "二", "三")
    println(s"Elements of listSet1 = $listSet1")
    println(s"Element 一 = ${listSet1("一")}")
    println(s"Element 二 = ${listSet1("二")}")
    println(s"Element 三 = ${listSet1("三")}")


  }
}


