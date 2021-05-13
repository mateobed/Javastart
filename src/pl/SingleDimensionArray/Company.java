package pl.SingleDimensionArray;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];

        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Adam", "Bodnar", 5500);
        employees[2] = new Employee("Krzysztof", "Kowalski", 4500);

        int employeeIndex = 2;
        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            System.out.println(employees[employeeIndex - 1].getFirstName() + " " +
                    employees[employeeIndex - 1].getLastName() + ": " +
                    employees[employeeIndex - 1].getSalary() + "zł");
        }

        System.out.println("Rozmiar tanlicy: " + employees.length);
    }
}
