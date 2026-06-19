
import java.io.*;
import java.util.*;
class Employee implements Serializable{
    int employeeId; String name; String department; double salary;
    Employee(int id,String n,String d,double s){
        employeeId=id; name=n; department=d; salary=s;
    }
}
public class EmployeeSkillAssignment{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("emp.dat"));
        out.writeObject(e);
        out.close();

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.dat"));
        Employee x=(Employee)in.readObject();
        System.out.println(x.employeeId+" "+x.name+" "+x.department+" "+x.salary);
        in.close();
    }
}
