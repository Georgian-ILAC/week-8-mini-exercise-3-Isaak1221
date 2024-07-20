 public class Employee extends Person {
        private int id;
        private double hourlyPay;

        public Employee(String firstName, String lastName, int heightFeet, int heightInches, int id, double hourlyPay) {
            super(firstName, lastName, heightFeet, heightInches);
            this.id = id;
            this.hourlyPay = hourlyPay;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getHourlyPay() {
            return hourlyPay;
        }

        public void setHourlyPay(double hourlyPay) {
            this.hourlyPay = hourlyPay;
        }

        public double getRaise() {
            hourlyPay *= 1.15;
            return hourlyPay;
        }

        public double payDay(int hoursWorked) {
            double totalPay = 0;
            if (hoursWorked > 40) {
                totalPay += 40 * hourlyPay;
                totalPay += (hoursWorked - 40) * hourlyPay * 1.5;
            } else {
                totalPay = hoursWorked * hourlyPay;
            }
            return totalPay;
        }

        @Override
        public String toString() {
            return super.toString() +
                    "They make $" + String.format("%.2f", hourlyPay) + "\n" +
                    "They have the employee ID " + id + "\n";
        }
    }
