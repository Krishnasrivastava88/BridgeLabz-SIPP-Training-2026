public class Seller extends Person{
    private String companyName;
    private double sellerRating;

    public Seller(int id,String name,String email,String companyName,double sellerRating){
        super(id,name,email);
        this.companyName=companyName;
        this.sellerRating=sellerRating;
    }
    public String getCompanyName(){return companyName;}
    public double getSellerRating(){return sellerRating;}

    public String toString(){
        return super.toString()+", Company="+companyName+", Rating="+sellerRating;
    }
}
