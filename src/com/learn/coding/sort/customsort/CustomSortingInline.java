package com.learn.coding.sort.customsort;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    String name;
    String empId;
    float salary;

    public Employee(String name, String empId, float salary){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class CustomSortingInline {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ram", "EMM01", 2000);
        Employee emp2 = new Employee("Shyam", "EMM02", 3000);
        Employee emp3 = new Employee("Sundar", "EMT01", 5000);
        Employee emp4 = new Employee("Ravi", "MMM04", 67000);
        Employee emp5 = new Employee("Srikant", "N100", 4500);

        Employee [] employees = {emp1, emp2, emp3, emp4, emp5};

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee t1, Employee t2) {
                return Float.compare(t1.salary, t2.salary);
            }
        });

        System.out.println(Arrays.toString(employees));
    }
}
