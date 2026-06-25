class Student{
static String universityName="XYZ University"; static int totalStudents=0;
private String name,grade; private final int rollNumber;
Student(String name,int rollNumber,String grade){this.name=name;this.rollNumber=rollNumber;this.grade=grade;totalStudents++;}
static void displayTotalStudents(){System.out.println(totalStudents);}
void display(){System.out.println(name+" "+rollNumber+" "+grade);}
public static void main(String[]a){Object o=new Student("Krishna",10,"A");
if(o instanceof Student)((Student)o).display();displayTotalStudents();}}