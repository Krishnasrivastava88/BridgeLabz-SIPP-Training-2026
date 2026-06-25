
interface CouponValidator{
    boolean validateCoupon(String code);
    static boolean isLengthValid(String code){ return code.length()>=5; }
}
class ShoppingCart implements CouponValidator{
    public boolean validateCoupon(String code){
        return CouponValidator.isLengthValid(code)&&code.startsWith("SAVE");
    }
    public static void main(String[] args){
        String[] codes={"SAVE10","ABC","SAVE50"};
        ShoppingCart c=new ShoppingCart();
        for(String s:codes)
            System.out.println(s+" : "+c.validateCoupon(s));
    }
}
