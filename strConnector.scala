package strConnector

object strConnector {

  def main(args: Array[String]): Unit ={

    var list = List ( "I" , "Love", "You")

    var space = " "

    println( connectStrings(list, space) )


  }


  def connectStrings(listOfString: List[String], separator: String): String= {

    var i = 0 ;

    var str = ""

    for ( i <- listOfString) {

      str = str + i + separator

    }

    return str

  }



}