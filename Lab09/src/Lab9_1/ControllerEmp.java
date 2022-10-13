package Lab9_1;

import java.util.List;

public class ControllerEmp {
    public static int TotalSalary1(List<String> ContractorEmpList) {
        int i = 0;
        int TotalSalary = 0;
        for (i = 0; i < ContractorEmpList.size(); i++) {
            TotalSalary = TotalSalary + 40000;
        }
        return TotalSalary;
    }

    public static int TotalSalary2(List<String> FullTimeEmpList) {
        int i;
        int TotalSalary = 0;
        for (i = 0; i < FullTimeEmpList.size(); i++) {
            TotalSalary = TotalSalary + 50000;
        }
        return TotalSalary;

    }

}
