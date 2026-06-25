class Vehicle{
    private String ownerName,vehicleType;
    static double registrationFee=1000;
    public Vehicle(String o,String v){ownerName=o;vehicleType=v;}
    public void displayVehicleDetails(){System.out.println(ownerName+" "+vehicleType);}
    public static void updateRegistrationFee(double f){registrationFee=f;}
}