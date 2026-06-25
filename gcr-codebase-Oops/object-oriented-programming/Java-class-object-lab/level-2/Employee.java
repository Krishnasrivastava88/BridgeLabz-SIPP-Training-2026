class Employee{
static String companyName="OpenAI"; static int totalEmployees=0;
private String name,designation; private final int id;
Employee(String name,int id,String designation){this.name=name;this.id=id;this.designation=designation;totalEmployees++;}
static void displayTotalEmployees(){System.out.println(totalEmployees);}
void display(){System.out.println(name+" "+id+" "+designation);}
public static void main(String[]a){Object o=new Employee("Krishna",1,"Dev");
if(o instanceof Employee)((Employee)o).display();displayTotalEmployees();}}