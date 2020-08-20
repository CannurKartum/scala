package EigthLab

object DuplicateStreams {
    def evaluate(items:Stream[Int], times:Stream[Int]):Stream[Int] =items match {
      case Stream(h, t @_*)  => times match {
        case Stream(head, tail @_*) => duplicate(head, h)#::: evaluate(t.toStream, tail.toStream)
      }
    }

  def duplicate(times:Int, item:Int):Stream[Int] = {
    if(times>0) item #:: duplicate(times-1, item)
    else Nil.toStream

  }

  def main(args: Array[String]): Unit = {
    println(evaluate( Stream.from(1), Stream.from(1)).take(30).force)
    println(evaluate( Stream.from(1), Stream.from(1)))
    print(evaluate(Stream(1,2,3), Stream(0,3,1,4)).take(4).force)
  }
}
