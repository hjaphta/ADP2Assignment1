/**
 *
 * Tasneem Jacobs  215030389
 * ADP2
 * Assignment 1 - Software development Infrastructor
 */
package za.ac.cput.adp2assignment1;



public class BankAccount {
    private String  id,name ,accountType ,accountHolder;
    private long accountNumber;
    private double balance;
    



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Bank{" + "id=" + id + ", name=" + name + ", accountType=" + accountType + ", accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }
    
    
}

