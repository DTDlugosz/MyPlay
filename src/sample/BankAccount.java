package sample;

public class BankAccount {

    private String id;
    private String name;
    private String surname;
    private long balance;

    //-------------------------------------------------------------

    public BankAccount (String id, String name, String surname, long balance){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    //---------------------------------------------------------------
    public void addBalance(long amount){
        this.balance += amount;
    }

    //---------------------------------------------------------------
    public void withdraw(long amount){
        this.balance -= amount;
    }

    //---------------------------------------------------------------
    public long showBalance(){
        return this.balance;
    }

    //---------------------------------------------------------------

    @Override
    public String toString(){
        return "ID: " + this.id + " |NAME: " + this.name + " |SURNAME: " + this.surname + " |BALANCE: " + this.balance;
    }

    //---------------------------------------------------------------

        /*
        NOTES

         */

    // END CLASS
}
