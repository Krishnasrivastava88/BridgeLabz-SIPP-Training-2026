class BankAccount{
static String bankName="ABC Bank"; static int totalAccounts=0;
private String accountHolderName; private final int accountNumber;
BankAccount(String accountHolderName,int accountNumber){
this.accountHolderName=this.accountHolderName=accountHolderName;
this.accountNumber=accountNumber; totalAccounts++; }
static void getTotalAccounts(){System.out.println(totalAccounts);}
void display(){System.out.println(accountHolderName+" "+accountNumber);}
public static void main(String[]a){Object o=new BankAccount("Krishna",101);
if(o instanceof BankAccount)((BankAccount)o).display(); getTotalAccounts();}}