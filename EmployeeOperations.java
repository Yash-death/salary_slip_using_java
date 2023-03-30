

public class EmployeeOperations {
    private double Salary;
    public EmployeeOperations(double Salary){
        this.Salary=Salary;
    }
    public double hra(){
        return this.Salary *0.50;
    }
    public double da(){
        return this.Salary *0.15;
    }
    public double ta(){
        return this.Salary *0.40;
    }
    public double ma(){
        return this.Salary *0.30;
    }
    public double pf(){
        return this.Salary *0.10;
    }
    public double gs(){
        return Math.round(this.Salary+this.hra()+this.da()+this.ta()+this.ma());
    }
    public double ns(){
        return Math.round(this.gs()-this.pf()+this.Tax());
    }
    public double Tax(){
        return this.gs()*0.10;
    }
}
