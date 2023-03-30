import java.util.Scanner;

public class Test_Employee {
 static MessageReader messagereader = new MessageReader();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(messagereader.getMessage("inputid.label"));
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println(messagereader.getMessage("inputname.label"));
        String name = sc.nextLine();
        System.out.println(messagereader.getMessage("inputsalary.label"));
        double salary = sc.nextDouble();
        sc.close();
        Employee employee = new Employee (id,name,salary);
        employee.print();
    }
}
