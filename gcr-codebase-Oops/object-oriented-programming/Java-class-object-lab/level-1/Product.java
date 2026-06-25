class Product{
    private String productName; private double price;
    static int totalProducts=0;
    public Product(String n,double p){productName=n;price=p;totalProducts++;}
    public void displayProductDetails(){System.out.println(productName+" "+price);}
    public static void displayTotalProducts(){System.out.println(totalProducts);}
}