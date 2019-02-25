package com.aline.scalacollection

import java.text.SimpleDateFormat
import java.util.{Calendar,Date}

class DateConversions {

  // conversion of Date from one format to another format using simple date format.

  val date = "22/06/2018"
  val sdf = new SimpleDateFormat("dd/MM/yyyy")
  val sdf1 = new SimpleDateFormat("yyyy-MM-dd")
  println(sdf1.format(sdf.parse(date)))

  val date1 = "22.06.2018"
  val sdf2 = new SimpleDateFormat("dd.MM.yyyy")
  val sdf3 = new SimpleDateFormat("yyyy-MM-dd")
  println(sdf3.format(sdf2.parse(date1)))

  val date2 = "05.11.2018"
  val sdf4 = new SimpleDateFormat("MM.dd.yyyy")
  val sdf5 = new SimpleDateFormat("yyyy-MM-dd")
  println(sdf5.format(sdf4.parse(date2)))

  val date3 = "1 Jun 18"

  val sdf6 = new SimpleDateFormat("dd MMM yy")
  val sdf7 = new SimpleDateFormat("yyyy-MM-dd")
  print(sdf7.format(sdf6.parse(date3)))
}
