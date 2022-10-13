package Lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        int TotalSalary = 0;
        List<String> ContractorEmpList = new ArrayList<>();
        ContractorEmpList = Arrays.asList("A1","A2","A3");
        List<String> FullTimeEmpList = new ArrayList<>();
        FullTimeEmpList = Arrays.asList("B1","B2");
        System.out.println("Contractor employee: "+ContractorEmpList);
        System.out.println("Fulltime employee: "+FullTimeEmpList);
        ControllerEmp.TotalSalary1(ContractorEmpList);
        ControllerEmp.TotalSalary2(FullTimeEmpList);
        System.out.println(TotalSalary);

    }
}
