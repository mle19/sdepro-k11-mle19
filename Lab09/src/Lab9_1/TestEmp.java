package Lab9_1;

import java.util.ArrayList;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        int i = 0;
        Employee a = new Employee();
        ControllerEmp Total = new ControllerEmp();
        List<Integer> emp = new ArrayList<>();
        for (i = 0; i < 2; i++) {
            a.inputEmp();
            if (a.typeEmp == 1){
                Total.TotalSalary(Total);
            } else i ++;
        }

        System.out.println(emp);


    }
}
