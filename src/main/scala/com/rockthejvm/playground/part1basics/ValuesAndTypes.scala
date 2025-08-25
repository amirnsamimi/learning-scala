package com.rockthejvm.playground.part1basics

object ValuesAndTypes {

  val meaningOfLife: Int = 42  // const meaningOfLife: Int = 42
  val anInteger = 30 // right-hand side type infer

  // common types
  val aBoolean: Boolean = true
  val aChar: Char = 'a' // single quote
  val anInt: Int = 10 // 4 bytes
  val aShort: Short = 10 // 2 bytes
  val aFloat: Float = 10.0f  // 4-byte decimal
  val aDouble: Double = 10.0 // 8-byte decimal
  val aLong: Long = 10L // 8-byte integer
  val aByte: Byte = 10
  val aUnit: Unit = ()
  
  // read about 
  // val unAssienedInt: uInt = 32
  // val unAssignedLong: uLong = 32L
  
  // string types
  val aString: String = "Hello World" //  double quotes

  def main(args: Array[String]): Unit = {

  }
}
