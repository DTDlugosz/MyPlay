package sample;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();

        BankAccount b1 = new BankAccount("001","Dawid","Dlugosz",50);
        BankAccount b2 = new BankAccount("002","Tom","Smith",30);
        BankAccount b3 = new BankAccount("003","Ras","Nothon",70);

        database.add(b1);
        database.add(b2);
        database.add(b3);




        System.out.println("Search:");
        System.out.println(database.printSearch("Tom","xx"));
        System.out.println();

        System.out.println(database.withdraw("Tom","Smith",10));
        System.out.println();

        System.out.println("Search:");
        System.out.println(database.printSearch("Tom","xx"));
        System.out.println();

    }
}
