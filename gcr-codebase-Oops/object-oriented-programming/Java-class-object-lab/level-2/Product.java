class Product{
static double discount=10;
private String productName; private double price; private int quantity; private final int productID;
Product(String productName,double price,int quantity,int productID){this.productName=productName;this.price=price;this.quantity=quantity;this.productID=productID;}
static void updateDiscount(double d){discount=d;}
void display(){System.out.println(productName+" "+productID);}
public static void main(String[]a){Object o=new Product("Pen",20,2,11);
if(o instanceof Product)((Product)o).display();}}