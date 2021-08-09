package sample;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Iterator;

public class Database {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    //---------------------------------------------------------------

    public Database(){}

    //---------------------------------------------------------------
    public void add(BankAccount b){
        this.accounts.add(b);
    }

    //---------------------------------------------------------------
    public void remove(BankAccount b){
        this.accounts.remove(b);
    }

    //---------------------------------------------------------------
    //not working
    public void printCustomers(){

        for (BankAccount b : accounts)
            System.out.println(b);

        }

        //---------------------------------------------------------------

    }
    /*
    NOTES
    -add display
    -add remove
    -add search
     */

    //END CLASS

