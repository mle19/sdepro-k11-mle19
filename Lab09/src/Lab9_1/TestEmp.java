package Lab9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        ControllerEmp salary1 = new ControllerEmp();
        Employee a = new ContractorEmp();
        a.setnumberEmp(1);
        a.settypeEmp(1);
        //a.inputEmp();
        Employee b = new FullTimeEmp();
        b.settypeEmp(2);
        b.setnumberEmp(2);
<<<<<<< HEAD
        System.out.println(a.gettypeEmp());
=======
        System.out.println(a.getnumberEmp());
>>>>>>> 4cac16e36a22f871e3c167a5035e18cdc8021735
        //b.inputEmp();
        List<Employee> employeeList = Arrays.asList(a,b);
        System.out.println(employeeList);
        int salary = new ControllerEmp().totalsalary(employeeList);
        System.out.println(salary);

    }

    }

