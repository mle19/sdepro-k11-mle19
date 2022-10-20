package Lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        Employee a1 = new ContractorEmp();
        Employee a2 = new ContractorEmp();
        Employee a3 = new ContractorEmp();
        a1.setName("A1");
        a1.setSalary(a1.getSalary());
        a2.setName("A2");
        a2.setSalary(a2.getSalary());
        a3.setName("A3");
        a3.setSalary(a2.getSalary());
        Employee b1 = new FullTimeEmp();
        Employee b2 = new FullTimeEmp();
        b1.setName("B1");
        b1.setSalary(b1.getSalary());
        b2.setName("B2");
        b2.setSalary(b2.getSalary());
        List<Employee> emp = Arrays.asList(a1,a2,a3,b1,b2);
        int totalsalary = new ControllerEmp().TotalSalary(emp);
        System.out.println(emp);
        System.out.println(" Total salary is: " + totalsalary);


    }
    }

