public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    //Constructor method
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //Calculate tax price
    public static double tax(int salary){
        if(salary <= 1000){
            return 0;
        } else {
            return salary*0.03;
        }
    }
    //Calculate bonus price
     public double bonus(int workHours){
        if(workHours >40){
            return (workHours - 40)*30;
        }
        else {
            return 0;
        }
    }
    //Calculate raise salary
    public double raiseSalary(int hireYear){
        if((2021 - hireYear) < 10){
            return salary * 0.05;

        }
        else if ((2021 - hireYear) >=10 && (2021 - hireYear) <=19) {

            return this.salary * 0.1;
        }
        else {
            return this.salary * 0.15;
        }
    }
    //Show the employee information
    public String toString(){
        return "Name : " + this.name +
                "\nSalary : " + this.salary +
                "\nWork Hours : " + this.workHours +
                "\nHire Year : " + this.hireYear +
                "\nTax : " + tax(salary) +
                "\nBonus : " + bonus(workHours) +
                "\nRise Salary : " + raiseSalary(salary) +
                "\nSalary with Bonus and Tax : " + (bonus(workHours) + this.salary - tax(salary)) +
                "\nTotal Salary : " + (this.salary + bonus(workHours) + raiseSalary(hireYear) - tax(salary));
    }
}
