package occurCalc

object occurCalc {

  def main(args: Array[String]): Unit ={

    var list = List("x" , "x" , "y", "z" , "z" , "x")

    var key = "z"

    println( occ(list, key))
  }

  def occ(list: List[String] , key: String):Int = {

    var num = 0

    var i =""

    for ( i <- list ){

      if ( i == key) num += 1

    }

    return num
  }

}