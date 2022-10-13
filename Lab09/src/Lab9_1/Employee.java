package Lab9_1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public Employee(){}
    public String name;
    public int salary;
    public Employee(int salary){
        this.salary = salary;
    }
    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    List<Employee> EmpList = new ArrayList<>();


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
