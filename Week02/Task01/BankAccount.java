package codechef.java;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private  int balance;

    BankAccount(String accountNumber,String accountHolderName,int initialbalance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=Math.max(0,initialbalance);


    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposit amount :"+"  "+amount);
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            System.out.println("withdraw amount"+" "+amount);
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficent amount");
        }
    }
    public void accounDetails(){
        System.out.println("accountHolderName"+" "+accountHolderName);
        System.out.println("accountNumber"+" "+accountNumber);
        System.out.println("balance"+" "+balance);
    }
    public static void main(String[] args){
        BankAccount bn=new BankAccount("8154935320251450","Satyam sahu",200);
        bn.accounDetails();
        System.out.println();
        bn.deposit(500);
        bn.withdraw(250);

        System.out.println();
        bn.accounDetails();



    }
}
