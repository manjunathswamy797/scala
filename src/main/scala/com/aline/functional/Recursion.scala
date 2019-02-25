package com.aline.functional

class Recursion {

/*  Recursion: means function can call itself repeatdly.
    When you are approaching any recursion follow the below steps:-
     1. Find the collection list.
     2. Implement the termination condition.
     3. Compute the head and recurse the tail.

   The problem with recursion is we have to wait for all recusrion to complete to get the value    */

  println("Example of factorial of a number.")

  def rFact(n:Int):Int = {                                 // Basic method
    var prod = 1
    var i = n
    while(i!=0){
      prod = prod * i
      i = i-1
    }
    prod
  }

  def rFact1(n:Int):Int = {                               //recursion function
    if(n == 0) return 1
    else n * rFact(n-1)
  }
  println(rFact(5))
  println(rFact1(5))

println(" example of a fibonacci")
  def fibn(n:Int):Int = {
    if(n==0) return 0
    else if(n==1) return 1
    else fibn(n-1)+fibn(n-2)
  }

// To overcome limitations of recursion use Tail Recursion.



}
