class LibraryBook{
    private String title,author; private double price; private boolean available=true;
    public LibraryBook(String t,String a,double p){ title=t; author=a; price=p; }
    public void borrowBook(){ if(available){available=false; System.out.println("Borrowed");} else System.out.println("Not Available");}
}