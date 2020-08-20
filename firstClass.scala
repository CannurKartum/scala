class firstClass extends Runnable{

  override def run(){

    println("Thread #" + Thread.currentThread().getName() )

  }
}

object myClass{

  def main(args: Array[String]) {

    for (i <- 1 to 5){

      var n = new Thread ( new firstClass() )

      n.setName( i.toString() )

      n.start()
    }
  }
}