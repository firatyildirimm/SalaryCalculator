public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(int salary){
        if(this.salary<1000)
            return 0;
        else
            return this.salary*3/100;
    }
    int bonus(int workHours){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }else
            return 0;
    }
    double raiseSalary(int hireYear){
        int year = 2021;
        if (2021 - this.hireYear <= 10){
            return this.salary*0.05;
        }else if(2021- this.hireYear > 10 && 2021- this.hireYear <= 19){
            return this.salary*0.10;
        }else if(2021- this.hireYear > 19){
            return this.salary*0.15;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "Salary = " + salary + '\n' +
                "WorkHours = " + workHours + '\n' +
                "HireYear = " + hireYear + '\n' +
                "Tax = " + tax(this.salary) + '\n' +
                "Bonus = " + bonus(this.workHours) + '\n' +
                "Raise Salary = " + raiseSalary(this.hireYear) + '\n' +
                "Salary with tax and bonuses " + (this.salary+bonus(this.workHours)+tax(this.salary)) + '\n' +
                "Total Salary = " + (this.salary+bonus(this.workHours)+tax(this.salary)
                        +raiseSalary(this.hireYear))
                 ;
    }
}
