public class BonusPaid {
    double salary;
    double bonus;

    double paid;

    public BonusPaid(double salary, double bonus){
        this.salary = salary;
        this.bonus = bonus;
        this.paid = salary + bonus;
    }

    public double payDay(){
        return paid;
    }


}
