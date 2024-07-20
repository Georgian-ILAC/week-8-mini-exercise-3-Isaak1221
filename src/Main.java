public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 5, 10, 1234, 20.00);
        System.out.println(employee.toString());
        System.out.println("Weekly pay: $" + String.format("%.2f", employee.payDay(45)));
        employee.getRaise();
        System.out.println("New hourly pay: $" + String.format("%.2f", employee.getHourlyPay()));
    }
}