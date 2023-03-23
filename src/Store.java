import java.sql.SQLOutput;
import java.util.ArrayList;

public class Store {
    public static void main(String[] args){
       // Person p1 = new Person("Signe", "Gladsaxevej");
        Customer c1 = new Customer("Sally", "Gladsaxevej", "s", "1234");
        Vendor v1 = new Vendor("Java Inc.", "Håbets Allé", "Lidls p-plads");


        //Vi har telefonnr., da vi har arvet den fra Person
       // p1.setPhoneNo("2353256");
        c1.setPhoneNo("1234565");
        v1.setPhoneNo("6544542");

        Person p2 = new Customer("Henry");
        p2.setPhoneNo("njdfsklæ");

        //methodA(p1);
        methodA(c1);
        methodA(v1);
        methodA(p2);


       // System.out.println(p1.toString());
    }

    public static void methodA(Person p){
        p.setPhoneNo("12345654");
    }
    /*
    public static void payAll(ArrayList<Employee>em){
        //Kør listen igennem og kald payday på alle objekter
        MonthlyPaid m1 = new MonthlyPaid("20000");
        HourlyPaid h1 = new HourlyPaid("130", "260");
        BonusPaid b1 = new BonusPaid("15000", "25000");
        payAll(m1);
        payAll(h1);
        payAll(b1);
    }*/
}
