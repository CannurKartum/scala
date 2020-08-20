class Employee (var rank: String, var surname: String, var firstName: String, var  salary: Int){
    def increase(percentage: Int):Unit ={
      this.salary = salary * (100 + percentage)/100
    }

    override def toString():String =
    {
      firstName +" "+ surname + " earns " + salary + "$"
    }
  }


  class SpecialistEmployee (specRank: String, specSurname: String, specFirstName: String, specSalary: Int, var bonus: Int) extends Employee(specRank: String, specSurname: String, specFirstName: String, specSalary: Int) {
    override def toString():String =
    {
      firstName +" "+ surname + " earns " + salary + "$ and have " + bonus + "$ of bonus"
    }
    def giveBonus(bonus: Int):Unit ={
      this.bonus=bonus
    }
  }


