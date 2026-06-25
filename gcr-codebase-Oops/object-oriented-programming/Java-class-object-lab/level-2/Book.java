class Book{
static String libraryName="Central Library";
private String title,author; private final String isbn;
Book(String title,String author,String isbn){this.title=title;this.author=author;this.isbn=isbn;}
static void displayLibraryName(){System.out.println(libraryName);}
void display(){System.out.println(title+" "+author+" "+isbn);}
public static void main(String[]a){Object o=new Book("Java","James","123");
if(o instanceof Book)((Book)o).display();displayLibraryName();}}