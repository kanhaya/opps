import inheritence.Employee;
import inheritence.SaleriedEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Jake","12/12/2012","12/02/2022");
        System.out.println(employee);

        Employee employee2=new Employee("Jake","12/12/2012","12/02/2022");
        System.out.println(employee2);

        SaleriedEmployee saleriedEmployee=new SaleriedEmployee("Raja","12/01/2021","12/03/2045",1232.0);
        System.out.println(saleriedEmployee);
        System.out.println(saleriedEmployee.collectPay());
    }
}