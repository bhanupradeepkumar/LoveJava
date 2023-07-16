package javamcqtest;

public class SavingsAccount {
    public static void main(String[] args){
        Savings c1 = new Savings();
        c1.setSavings(4238000,"bhanu",13717);
        c1.showSavings();
        c1.deposit(1000);
        c1.showSavings();
        c1.withdraw(5500);
        c1.showSavings();
    }
}

class Savings{
    int accountNumber;
    String accountHolder;
    int accountBalance;

    void setSavings(int aN,String acH,int aB){
        accountNumber = aN;
        accountHolder = acH;
        accountBalance = aB;
    }

    void showSavings(){
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println(accountBalance);
    }

    void withdraw(float amtTowithdraw){
        System.out.println("withdrawing amount....");
        accountBalance -=amtTowithdraw;
        System.out.println("withdrawing successful...."+amtTowithdraw);

    }
    void deposit(int amtToDeposit){
        System.out.println("depositing amount....");
        accountBalance +=amtToDeposit;
        System.out.println("depositing successful...."+amtToDeposit);
    }
}
