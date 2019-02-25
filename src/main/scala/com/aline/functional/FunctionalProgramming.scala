package com.aline.functional

class FunctionalProgramming{

  // functional_programming : is the way of writing software applications using only pure functions and immutable values.
  /* pure function :
     1. output completely depends on input.
     2. The function will not change the input parameter
     3. The function will not do extra except computing the output.
     4. we can validate pure functions through referential transparency */

  println("pure function")
  println(Math.sqrt(4.0) )            // pure function and all mathematical functions are pure.

  println(" side effect function")
  var g = 10                          // not a pure function which gives the side effect
  def rt(i:Int):Int = {
    g = g +10
    g
  }
  println(rt(5))                      // calling the method by passing same argument gives the different result.
  println(rt(5))


/* First class functions: functions are said to be first class functions if we are able treat functions as values, means whatever we
                           are ale to able to do with value we should be able to do with functions.
   1. Assign to a variable.
   2. pass as argument to function.
   3. return  function from function.

   By default all scala functions are first class functions. */

  println(" first class function example Doubler method")
  def doubler(i:Int):Int = {return i*2}
  val f1 = doubler(4)                         // assigning function to variable.

  val r = 1 to 10                             // scala collection Range
  println(r.map(doubler(_)))                // passing doubler function as argument to Map function, hence map is Ho-Fun.


/* Higher_order_functions: which satisfies the anyone of the below conditions.
   1. Takes function as an argumnet.
   2. Returns Function from a Function.
   same doubler example where map takes function as argument.*/

/* Anonymous Functions : Functions which don't have function name and used for inline functions.
                          whenever we are using function at single time.
                          Anonymous functions mainly used for HO-FUnc*/

  println(" Anonymous Function  Example")

  val anFunc = (i:Int) => {i*3}
  println(anFunc(3))
  val anFunc1 = r.filter((i:Int)=> i%2 == 0)      // Filter is a HO-Func : filtering only even numbers.
  println(anFunc1)
  println(r.map(_*2))

  val salaries = Array(2000,2500,4000,5000)
  salaries.map(doubler(_))
  salaries.map((x:Int) => x * 2)
  salaries.map(_*2)




  def warning(name: String) = {
    println(name+" please use the helmet while riding Bike")
  }
  val customers = "Manju,Ezhil,Aravinth".split(",")

  def alertMsg(name:Array[String],warning:String => Unit)={
    for(i <- 0 to name.length -1 ){
      warning(name(i))
    }
  }

  alertMsg(customers,warning)                                    // passing warning function as argument.
  customers foreach(warning)


}
