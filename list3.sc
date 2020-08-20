def grayCode (numberOf :Int): List[String] = {

  def countingGray(j: Int, list: List[String]): List[String] = {

    if(j<=0) {

      return list
    }

    val listRev = list.reverse
    val list1: List[String]= listRev.flatMap(i => List("1" + i))
    val list2: List[String]= list.flatMap(i => List("0" + i))

    countingGray(j-1, list2:::list1)
  }
  countingGray(numberOf, List(""))
}

print(grayCode(numberOf = 3))
