class Patient{
static String hospitalName="City Hospital"; static int totalPatients=0;
private String name,ailment; private int age; private final int patientID;
Patient(String name,int age,String ailment,int patientID){this.name=name;this.age=age;this.ailment=ailment;this.patientID=patientID;totalPatients++;}
static void getTotalPatients(){System.out.println(totalPatients);}
void display(){System.out.println(name+" "+patientID+" "+ailment);}
public static void main(String[]a){Object o=new Patient("Krishna",20,"Fever",1);
if(o instanceof Patient)((Patient)o).display();getTotalPatients();}}