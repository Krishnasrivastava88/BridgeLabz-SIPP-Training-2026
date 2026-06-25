class MovieTicket {
    private String movieName;
    private String seat;
    private double price;

    public MovieTicket(String movieName){
        this.movieName=movieName;
    }

    public void book(String seat,double price){
        this.seat=seat;
        this.price=price;
    }

    public void display(){
        System.out.println("Movie: "+movieName);
        System.out.println("Seat: "+seat);
        System.out.println("Price: "+price);
    }
}
