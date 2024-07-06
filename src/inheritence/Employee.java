package inheritence;

public class Employee extends Worker {
    private int empId;
    private String hireDate;
    private static int count=1;
    public Employee(){

    }
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.empId = count++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
