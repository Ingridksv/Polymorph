public class HourlyPaid implements Employee{

    double hours;
    double hourlyPay;
    double salary;

    public HourlyPaid(double hours, double hourlyPay){
        this.hours = hours;
        this.hourlyPay = hourlyPay;
        this.salary = hours * hourlyPay;
    }
    public double payDay() {
        return salary;
    }
}
