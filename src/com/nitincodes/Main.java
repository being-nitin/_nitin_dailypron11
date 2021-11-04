package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	/* Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

	 */
Employee e1 = new Employee();
e1.salary = 550;
e1.noOfHours = 7;
e1.getInfo(e1.salary, e1.noOfHours);
e1.AddSaL();
e1.Addwork();
    }
}
class Employee{
    int salary;
    int noOfHours;
    void getInfo(int salary, int noOfHours){
        System.out.println("salary and no of hours of an employee is"+salary+":"+noOfHours);
    }
    void AddSaL(){
        if (salary<500){
            salary = salary + 10;
            System.out.println("the new salary of the employee is" +salary);
        }
        else{
            System.out.println(salary);
        }
    }
    void Addwork(){
        if (noOfHours>6){
            salary = salary + 5;
            System.out.println("the salary of hardworking employee is"+salary);
        }
    }
}