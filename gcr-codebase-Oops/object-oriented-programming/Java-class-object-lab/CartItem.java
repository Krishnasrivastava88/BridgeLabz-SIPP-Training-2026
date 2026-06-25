class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName,double price){
        this.itemName=itemName;
        this.price=price;
        this.quantity=0;
    }

    public void addItem(int qty){
        quantity+=qty;
    }

    public void removeItem(int qty){
        if(qty<=quantity) quantity-=qty;
    }

    public void displayTotal(){
        System.out.println("Total = "+(price*quantity));
    }
}
