package sample;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;


public class Database {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    //---------------------------------------------------------------

    public Database() {
    }

    //---------------------------------------------------------------
    public void add(BankAccount b) {
        this.accounts.add(b);
    }

    //---------------------------------------------------------------
    public void remove(BankAccount b) {
        this.accounts.remove(b);
    }

    //---------------------------------------------------------------
    public void printCustomers() {
        int i = 0;
        for (BankAccount b : accounts){
            System.out.println(accounts.get(i));
            i++;
        }

    }

    //---------------------------------------------------------------
    public BankAccount search(String name, String surname){
        BankAccount o = null;

        int i = 0;

        boolean check = false;
        for (BankAccount b : accounts){
            if (name.equals(b.getName()) ||
                    surname.equals(b.getSurname())){

                o = accounts.get(i);
                check = true;
                break;
            }
            i++;
        }
        return o;
    }

    //---------------------------------------------------------------
    public String printSearch(String name, String surname){
        StringBuilder sb = new StringBuilder();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);

        BankAccount bk = search(name, surname);
        long data1;
        String data2;

        if (bk == null){
            sb.append(String.format("Account not found!"));
        }else{
            data1 = bk.showBalance();
            data2 = nf.format(data1);
            sb.append(String.format("%s %s %s %s", bk.getId(),
                    bk.getName(), bk.getSurname(), data2));
        }
        return sb.toString();
    }

    //---------------------------------------------------------------
    public String withdraw(String name, String surname, int amount){
        StringBuilder sb = new StringBuilder();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);

        BankAccount bk = search(name, surname);
        long data1 = bk.showBalance();
        String data2;

        if (bk == null){
            sb.append(String.format("Account not found!"));
        }else{
            data1 -= amount;
            data2 = nf.format(amount);
            bk.withdraw(amount);
            sb.append(String.format("%s %s withdraw %s",bk.getName(), bk.getSurname(), data2));
        }
        return sb.toString();
    }


    /*
    NOTES
    -add display
    -add remove
    -add search
     */

    //END CLASS
}
