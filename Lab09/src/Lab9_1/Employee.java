package Lab9_1;

import java.util.Scanner;

public class Employee {
    public Employee(){}
    public int numberEmp;
    public int typeEmp;
    public Employee(int typeEmp, int numberEmp){
        this.numberEmp = numberEmp;
        this.typeEmp = typeEmp;
    }

    public int getnumberEmp() {
        return numberEmp;
    }

    public void setnumberEmp(int numberEmp) {
        this.numberEmp = numberEmp;
    }

    public int gettypeEmp() {
        return typeEmp;
    }

    public void settypeEmp(int typeEmp) {
        this.typeEmp = typeEmp;
    }

    /*public Employee inputEmp(){
        System.out.println("Number's employees: ");
        Scanner scanner = new Scanner(System.in);
        numberEmp = scanner.nextInt();
        System.out.println("Type of employee: ");
        Scanner scanner2 = new Scanner(System.in);
        typeEmp = scanner2.nextInt();

        return null;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "NumberEmp=" + numberEmp +
                ", typeEmp=" + typeEmp +
                '}';
    }
}


