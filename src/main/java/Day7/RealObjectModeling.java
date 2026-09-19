package Day7;

public class RealObjectModeling {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("12345678910", "Mannu", 0);
        System.out.println("First balance was "+ba.getBalance());
        ba.deposit(100000);
        System.out.println(ba.getBalance());
        ba.withdraw(5000000);
        System.out.println(ba.getBalance());
    }
}


//Bank Operations
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance ;

    BankAccount(String accountNumber,  String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance =  balance;
    }


    public double deposit(double amount){
        if(amount >= 0){
            balance = balance+amount;
        }
        return balance;
    }



    public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance !!!!!!!");
            return 0;
        } else  {
            balance = balance-amount;
            return balance;
        }
    }


    public void printDetailsofBank(){
        System.out.println(this.accountHolderName+" "+ this.accountNumber+" "+ this.balance);
    }




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}