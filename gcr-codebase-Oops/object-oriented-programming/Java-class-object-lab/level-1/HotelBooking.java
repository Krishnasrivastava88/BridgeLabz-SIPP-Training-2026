class HotelBooking{
    private String guestName; private String roomType; private int nights;
    public HotelBooking(){ this("Guest","Standard",1); }
    public HotelBooking(String g,String r,int n){ guestName=g; roomType=r; nights=n; }
    public HotelBooking(HotelBooking h){ this(h.guestName,h.roomType,h.nights); }
}