public class MonthlyPaid implements Employee{

        double salary;
        public MonthlyPaid(double salary){
            this.salary = salary;
        }
       public double payDay() {
           return salary;
        }
}
