package Lab9_1;

import java.util.ArrayList;
import java.util.List;

import static Lab9_1.ContractorEmp.*;

public class ControllerEmp {
    public int TotalSalary(List<Employee> employeeList) {
        List<Employee> a = new ArrayList<>();
        int totalsalary = 0;
        for (Employee emp : employeeList) {
            totalsalary = totalsalary + emp.getSalary();
        }
        return totalsalary;

    }

        }














