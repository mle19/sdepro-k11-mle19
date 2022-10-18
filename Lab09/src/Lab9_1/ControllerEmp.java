package Lab9_1;

import java.util.List;

import static Lab9_1.ContractorEmp.*;

public class ControllerEmp {
    /*public void TotalSalary() {
        Employee a = new Employee();
        ContractorEmp b = new ContractorEmp();
        FullTimeEmp c = new FullTimeEmp();
        int contractorEmpTT = 0;
        int fullTimeEmpTT = 0;
        int total1 = contractorEmpTT + fullTimeEmpTT;
        if (a.typeEmp == 1) {
            contractorEmpTT = contractorEmpTT + (b.numberEmp * 40000);
            total1 = contractorEmpTT + fullTimeEmpTT;
        } else {
            if (a.typeEmp == 2) {
                fullTimeEmpTT = fullTimeEmpTT + (c.numberEmp * 50000);
                total1 = contractorEmpTT + fullTimeEmpTT;
            }
            System.out.printl(total1);
        }
    }*/
    public int totalsalary(List<Employee> employeeList) {
        int total1 = 0;
        int total2 = 0;
        int total = 0;
        for (Employee emp : employeeList) {

            if (emp.gettypeEmp() == 1) {
                total1 = total1 + emp.getnumberEmp() * 40000;
            } else if (emp.gettypeEmp() == 2) {
                total2 = total2 + emp.getnumberEmp() * 50000;
            }
        }

        total = total1 + total2;
        return total;
    }
}












