package Lab9_1;

import java.util.Scanner;

public class FullTimeEmp extends Employee{
    public int NumberEmp;
    public int typeEmp;
    public FullTimeEmp(){
        super();
    }
    public FullTimeEmp(int NumberEmp, int typeEmp){
        super();
        this.NumberEmp = NumberEmp;
        this.typeEmp = typeEmp;
    }

    @Override
    public int getNumberEmp() {
        return NumberEmp;
    }

    @Override
    public void setNumberEmp(int numberEmp) {
        NumberEmp = numberEmp;
    }

    @Override
    public int getTypeEmp() {
        return typeEmp;
    }

    @Override
    public void setTypeEmp(int typeEmp) {
        this.typeEmp = typeEmp;
    }

    @Override
    public void inputEmp() {
        super.inputEmp();
        System.out.println("Employee's numbers: ");
        Scanner scanner = new Scanner(System.in);
        NumberEmp = scanner.nextInt();
        System.out.println("Type of employee: ");
        Scanner scanner2 = new Scanner(System.in);
        typeEmp = scanner2.nextInt();
    }

    @Override
    public String toString() {
        return "FullTimeEmp{" +
                "NumberEmp=" + NumberEmp +
                ", typeEmp=" + typeEmp +
                '}';
    }
}

