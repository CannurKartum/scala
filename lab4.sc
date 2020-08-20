def func(a: Double, r: Double, n: Int): List[Double] = {

  var i = 0

  var t = a

  if ( n == 0 ) List()

  else if ( n == 1) List(a)

  else a :: func(a + r, r , n - 1);

}

println(func(2,3,4))



def combine(listOfString: List[String], separator: String): String = {

  var str: String = ""

  if ( listOfString.size == 1) {

    str = str + listOfString.head

  }
  else {
    str += listOfString.head + separator

    str += combine(listOfString.tail, "-")

  }

  return str
}

println(combine(List("This","is","string") , "-"))