package Lab9_1;

import java.util.Scanner;

public class Employee {
    public Employee(){}
    public int NumberEmp;
    public int typeEmp;
    public Employee(int typeEmp, int NumberEmp){
        this.NumberEmp = NumberEmp;
        this.typeEmp = typeEmp;
    }

    public int getNumberEmp() {
        return NumberEmp;
    }

    public void setNumberEmp(int numberEmp) {
        NumberEmp = numberEmp;
    }

    public int getTypeEmp() {
        return typeEmp;
    }

    public void setTypeEmp(int typeEmp) {
        this.typeEmp = typeEmp;
    }

    public void inputEmp(){
        System.out.println("Number's employees: ");
        Scanner scanner = new Scanner(System.in);
        NumberEmp = scanner.nextInt();
        System.out.println("Type of employee: ");
        Scanner scanner2 = new Scanner(System.in);
        typeEmp = scanner2.nextInt();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "NumberEmp=" + NumberEmp +
                ", typeEmp=" + typeEmp +
                '}';
    }
}


