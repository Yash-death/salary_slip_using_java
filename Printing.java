

public class Printing {
    MessageReader messagereader = new MessageReader();
    Formatting formatting = new Formatting();
    public void PrintSalary(Employee emp) {
        System.out.println(messagereader.getMessage("id.label")+emp.getId());
        System.out.println(messagereader.getMessage("name.label")+emp.getName());
        System.out.println(messagereader.getMessage("salary.label")+formatting.getSymbols()+emp.getSalary());
        System.out.println(messagereader.getMessage("hra.label")+formatting.getSymbols()+emp.getEmployeeOperations().hra());
        System.out.println(messagereader.getMessage("da.label")+formatting.getSymbols()+emp.getEmployeeOperations().da());
        System.out.println(messagereader.getMessage("ta.label")+formatting.getSymbols()+emp.getEmployeeOperations().ta());
        System.out.println(messagereader.getMessage("ma.label")+formatting.getSymbols()+emp.getEmployeeOperations().ma());
        System.out.println(messagereader.getMessage("pf.label")+formatting.getSymbols()+emp.getEmployeeOperations().pf());
        System.out.println(messagereader.getMessage("gs.label")+formatting.getSymbols()+emp.getEmployeeOperations().gs());
        System.out.println(messagereader.getMessage("ns.label")+formatting.getSymbols()+emp.getEmployeeOperations().ns());
    }
}
