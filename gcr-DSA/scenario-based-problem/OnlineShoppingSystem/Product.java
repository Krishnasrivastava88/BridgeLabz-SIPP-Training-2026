public class Product{
    private int productId;
    private String productName;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;
    private Seller seller;

    public Product(int productId,String productName,String category,double price,double rating,boolean inStock,Seller seller){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
        this.price=price;
        this.rating=rating;
        this.inStock=inStock;
        this.seller=seller;
    }

    public int getProductId(){return productId;}
    public String getProductName(){return productName;}
    public String getCategory(){return category;}
    public double getPrice(){return price;}
    public double getRating(){return rating;}
    public boolean isInStock(){return inStock;}
    public Seller getSeller(){return seller;}

    public String toString(){
        return productName+" ("+category+") Price="+price+" Rating="+rating;
    }
}
