package inheritence;

public class SaleriedEmployee extends Employee{
 private  Double annualSal;
 private  Boolean isRetired;

 public SaleriedEmployee(String name, String birthDate, String hireDate, Double annualSal) {
  super(name, birthDate, hireDate);
  this.annualSal = annualSal;
 }

 public void retired(){
  this.isRetired=true;
 }

 @Override
 public String toString() {
  return "SaleriedEmployee{" +
          "annualSal=" + annualSal +
          ", isRetired=" + isRetired +
          "} " + super.toString();
 }
 @Override
 public Double collectPay(){
  return annualSal/12;
 }
}
