package Lab9_1;

import java.util.Scanner;

public class ContractorEmp extends Employee{
    public int NumberEmp;
    public int typeEmp;
    public ContractorEmp(){
        super();
    }
    public ContractorEmp(int NumberEmp, int typeEmp){
        super();
        this.NumberEmp = NumberEmp;
        this.typeEmp = typeEmp;
    }

    @Override
    public int getNumberEmp() {
        return this.NumberEmp;
    }

    public void setNumberEmp(int numberEmp) {
        NumberEmp = numberEmp;
    }

    public int getTypeEmp(int typeEmp) {
        return this.typeEmp;
    }

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
        return "ContractorEmp{" +
                "NumberEmp=" + NumberEmp +
                ", typeEmp=" + typeEmp +
                '}';
    }
}
