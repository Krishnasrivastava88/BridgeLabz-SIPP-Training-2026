class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text){
        this.text=text;
    }

    public void check(){
        String rev="";
        for(int i=text.length()-1;i>=0;i--){
            rev+=text.charAt(i);
        }
        if(text.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
