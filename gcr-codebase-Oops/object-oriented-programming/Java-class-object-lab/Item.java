class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode,String itemName,double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    public void display(int quantity){
        System.out.println("Item: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Total Cost: "+(price*quantity));
    }
}
