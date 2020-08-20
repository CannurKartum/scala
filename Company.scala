import scala.collection.mutable.ListBuffer

class Company {
  var allEmployees: ListBuffer[Employee] = ListBuffer[Employee]()
  var allSpecEmployees: ListBuffer[SpecialistEmployee] = ListBuffer[SpecialistEmployee]()

  def addEmployee(surname: String, firstName: String, salary: Int): ListBuffer[Employee] ={
    val a = new Employee("Employee ", surname, firstName, salary)
    allEmployees += a
  }

  def addSpecialistEmployee(surname: String, firstName: String, salary: Int, bonus: Int): Unit ={
    val b = new SpecialistEmployee("Specialist Employee ", surname, firstName, salary, bonus)
    allEmployees+=b
    allSpecEmployees+=b
  }

  def increaseSalaries(percentage: Int):Unit = {
    def increaseSal(per: Int, list: ListBuffer[Employee]): ListBuffer[Employee] = {
      if (list.isEmpty) {
        return ListBuffer[Employee]()
      }
      list.head.increase(per)
      increaseSal(per, list.tail)
    }
    increaseSal(percentage,allEmployees)
  }

  def giveBonuses(amount: Int):Unit ={
    println("Bonus granted: " + amount + "$")
    def deleteSpec(list: ListBuffer[Employee]):ListBuffer[Employee]= {
      if(list.isEmpty){
        return ListBuffer[Employee]()
      }
      if(list.head.rank=="Specialist Employee "){allEmployees-=list.head}
      deleteSpec(list.tail)
    }
    deleteSpec(allEmployees)
    evaluateBon(amount, allSpecEmployees)
  }

  def evaluateBon(am: Int, list: ListBuffer[SpecialistEmployee]):ListBuffer[SpecialistEmployee]= {
    if(list.isEmpty){
      return ListBuffer[SpecialistEmployee]()
    }
    list.head.giveBonus(am)
    allEmployees+=list.head
    evaluateBon(am, list.tail)
  }
  override def toString():String ={
    printAllEmployees(allEmployees.toList).toString()
  }

  def printAllEmployees(empToPrint: List[Employee]):List[Employee] = {
    if(empToPrint.isEmpty){
      return Nil
    }
    println(empToPrint.head)
    printAllEmployees(empToPrint.tail)
  }


}
object Main extends Company{
  def main(args: Array[String]): Unit = {
    val company = new Company()
    company.addEmployee("Kartum", "Cannur", 8000)
    company.addEmployee("Perry", "Katty", 7000)
    company.addSpecialistEmployee("Dams", "Handy", 1000, 0)
    println(company)
    company.increaseSalaries(10)
    company.giveBonuses(200)
    println(company)
  }
}