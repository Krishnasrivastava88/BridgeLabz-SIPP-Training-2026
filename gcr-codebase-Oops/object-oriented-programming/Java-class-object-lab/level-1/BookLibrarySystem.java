class Book{
    public String ISBN;
    protected String title;
    private String author;
    public void setAuthor(String a){author=a;}
    public String getAuthor(){return author;}
}
class EBook extends Book{
    public void show(){System.out.println(ISBN+" "+title);}
}