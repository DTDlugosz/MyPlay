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
    public String getName(){
        return this.name;
    }

    //---------------------------------------------------------------
    public String getSurname(){
        return this.surname;
    }
    //---------------------------------------------------------------
    public String getId(){
        return this.id;
    }


    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.surname + " " + this.balance;
    }

    //---------------------------------------------------------------

        /*
        NOTES

         */

    // END CLASS
}
