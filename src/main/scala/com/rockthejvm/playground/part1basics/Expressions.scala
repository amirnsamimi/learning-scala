package com.rockthejvm.playground.part1basics

// Singleton object that encapsulates all the code ( unit of our program )
object Expressions {

  val meaningOfLife: Int = 42 + 2

  // other expressions + - * / bitwise | & >> <<
  val mathExpression: Int = 10 + 20 * 30 / 40

  // boolean expressions > < == ===
  val booleanExpression: Boolean = 1 ==  2  // expression returns true or false

  // if expression
  val anIfExpression: Int = if (booleanExpression) 10 else 20
  val anotherIfExpression: Int = if booleanExpression then 10 else 20

  // Code Blocks are also expressions
  val aCodeBlock: Int = {
    val aVariable = 10
    // code block can contain multiple expressions
    val anotherVariable = 20
    aVariable + anotherVariable // this will be the last expression in the block and the value returned by the block
  }

  val aCodeBlock_v2: Int =
    // new indentation = start block
    val localValue = 10
    val anotherLocalValue = 20
    localValue + anotherLocalValue

  // pattern matching -> switch case

  val someValue: Int = 2
  val description: String = someValue match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }

  // execution starts from main
  def main(args: Array[String]): Unit = {
    println(anIfExpression)
  }

}


