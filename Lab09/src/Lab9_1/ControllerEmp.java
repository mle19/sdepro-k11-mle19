package Lab9_1;

public class ControllerEmp {
    public void TotalSalary(ControllerEmp total) {
        Employee a = new Employee();
        ContractorEmp b = new ContractorEmp();
        FullTimeEmp c = new FullTimeEmp();
        int ContractorEmpTT = 0;
        int FullTimeEmpTT = 0;
        int Total1 = ContractorEmpTT + FullTimeEmpTT;
        if (a.typeEmp == 1) {
            ContractorEmpTT = ContractorEmpTT + (b.NumberEmp * 40000);
            Total1 = ContractorEmpTT + FullTimeEmpTT;
        } else {
            if (a.typeEmp == 2) {
                FullTimeEmpTT = FullTimeEmpTT + (c.NumberEmp * 50000);
                Total1 = ContractorEmpTT + FullTimeEmpTT;
            }
            System.out.println(Total1);

        }



    }


}

