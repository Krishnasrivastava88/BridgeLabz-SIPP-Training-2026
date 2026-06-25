class Vehicle{
static double registrationFee=1000;
private String ownerName,vehicleType; private final String registrationNumber;
Vehicle(String ownerName,String vehicleType,String registrationNumber){this.ownerName=ownerName;this.vehicleType=vehicleType;this.registrationNumber=registrationNumber;}
static void updateRegistrationFee(double f){registrationFee=f;}
void display(){System.out.println(ownerName+" "+registrationNumber);}
public static void main(String[]a){Object o=new Vehicle("Krishna","Car","UP123");
if(o instanceof Vehicle)((Vehicle)o).display();}}