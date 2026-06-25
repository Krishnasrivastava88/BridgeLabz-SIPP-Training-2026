class BankAccount {
    private String holder;
    private int accountNumber;
    private double balance;

    public BankAccount(String holder,int accountNumber,double balance){
        this.holder=holder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance) balance-=amount;
        else System.out.println("Insufficient Balance");
    }

    public void display(){
        System.out.println("Balance: "+balance);
    }
}
