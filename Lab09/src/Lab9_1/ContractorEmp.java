package Lab9_1;

public class ContractorEmp extends Employee{
    @Override
    public int gettypeEmp() {
        return (1);
    }

    @Override
    public void setnumberEmp(int numberEmp) {
        super.setnumberEmp(numberEmp);
    }

    @Override
    public void settypeEmp(int typeEmp) {
        super.settypeEmp(typeEmp);
    }
}
