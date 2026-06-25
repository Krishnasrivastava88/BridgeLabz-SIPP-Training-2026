interface Refuelable{void refuel();}
class Vehicle{String model;int maxSpeed;Vehicle(String m,int s){model=m;maxSpeed=s;}}
class ElectricVehicle extends Vehicle{ElectricVehicle(String m,int s){super(m,s);}void charge(){}}
class PetrolVehicle extends Vehicle implements Refuelable{PetrolVehicle(String m,int s){super(m,s);}public void refuel(){System.out.println("Refueling");}}