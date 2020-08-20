def linear(function:Double=>Double, x:(Double,Double),n:Double):Double={

  val interval =  (x._2 - x._1 ) / n

  def sub ( sum: Double, h: Double, function: Double => Double, x: ( Double , Double ) ) : Double ={

    if ( x._1 > x._2 ) sum

    else sub ( sum + ( h / 2 ) * ( function ( x._1 ) + function ( x._1 + h ) ) , h , function , ( x._1 + h , x._2 ) )
  }

  sub(0, interval , function, x )
}