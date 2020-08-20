def odd( a : Int ) : Stream[Int] = {

  if ( (a % 2) == 1 )

    Stream.cons ( a, odd ( a + 2 ) )

  else

    Stream.cons ( a + 1, odd ( a + 2 ) )

}


println(odd(12))