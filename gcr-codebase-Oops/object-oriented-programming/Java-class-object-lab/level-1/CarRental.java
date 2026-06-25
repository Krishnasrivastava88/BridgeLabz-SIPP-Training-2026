class CarRental{
    private String customerName,carModel; private int rentalDays;
    public CarRental(){ this("Guest","Sedan",1); }
    public CarRental(String c,String m,int d){ customerName=c; carModel=m; rentalDays=d; }
    public double totalCost(){ return rentalDays*1000; }
}