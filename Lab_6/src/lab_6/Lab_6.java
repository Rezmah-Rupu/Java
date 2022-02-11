package Lab_6;

import java.util.Calendar;
public class Account{

    //public static void main(String[] args) {
        // TODO code application logic here
    //
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private double monthlyInterestRate;
    private double monthlyInterestAmount;
    private Calendar datecreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void getMonthlyInterestRate() {
       monthlyInterestRate = annualInterestRate / 12;
       return monthlyInterestRate;
    }
    public void setMonthlyInterestRate(double monthlyInterestRate) {
       this.monthlyInterestRate = monthlyInterestRate;
    }
     
    public void getMonthlyInterestAmount() {
       monthlyInterestAmount = balance * monthlyInterestRate;
       return monthlyInterestAmount;
    }
    public void setMonthlyInterestAmount(double monthlyInterestAmount) {
        this.monthlyInterestAmount = monthlyInterestAmount;
    }

    public Calendar getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Calendar datecreated) {
        this.datecreated = datecreated;
    }
    
     double withdraw(double amount) {
		return balance -= amount;
	}	
	double deposit(double amount) {
		return balance += amount;
	}
        
        public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated()); 

    }
}
