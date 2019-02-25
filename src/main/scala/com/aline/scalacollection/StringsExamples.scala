package com.aline.scalacollection

class StringsExamples {

  /* scala string as same as java string and we can use the java string methods also.
     string we can loop as each character as a collection.
     Following example shows the class of value.
   */

  println("scala".getClass.getName)
  println(10.getClass.getName)

  println("scala".length)                 // get the length of the string.
  println("scala"+"learning")             // concatenate the two or more string.
  "scala".foreach(println)                //  print the each character of a string.

  val c = "Bangalore"
  for(i <- 0 to c.length-1)println(i)

  val str1 = "scala"
  val str2 = "scala"
  println(str1 == str2)                   // checking the two strings equality gives the result Boolean value.
  println(str1.equalsIgnoreCase(str2))

  val str3 = null
  val str4 = "scala"
 // println(str3.toLowerCase == str4.toLowerCase)     // we will get Null pointer Exception when we convert to lower or upper and check equality.

  println("Bangalore".drop(2).take(2))                        // Drops the no of characters from string.
  println("bangalore".capitalize)                             // capitalize mathod makes the first char of string to Capital.

  val cities = "Chennai,Bangalore,Hyderbad".split(",")  // split the string with field seperator which gives the Array of Strings.
  println(cities)

  var caps = "manjunath swamy".split(" ").map(_.capitalize).mkString(" ")



  /* Substuting variables in to Strings, called String interpolation.There are 3  types s , f and raw
      s is the basic interpolation which we have to preceed your string literal with s.*/

  val name = "Manju"
  val age  =  24
  val weight = 200.0

  println(s" $name age is:$age and weight is $weight")
  println(name+" age is : "+age+" and weight is "+weight)     // we can use + as concatenation

  // use expression in {}

  println(s" next year my age is ${age+1}")
  println(s" my age is 33 years ${age == 33}")

  // f string interpolator uesd like printf formatting style
  println(f"my age is $age%d")
  println(f"my weight is $weight%.2f")           // gives the two decimal points.
  println(f"my weight is $weight%.0f")

  // raw string interpolation which is used to no escaping of literals in string.

  println(raw" Hi\t everyone ")
  println(raw" Hi \n everyone ")


  // processing a string one character at a time. we can use map or combination of for and yield

  "cookBook".map(_.toUpper)
  for(i <- "cookBook") yield i.toUpper
  for{i <- "cookBook" if i != '0'} yield i.toUpper


  // Finding a patterns in a string which matches a regular expression



}
