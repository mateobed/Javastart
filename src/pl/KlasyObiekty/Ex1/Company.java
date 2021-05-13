package pl.KlasyObiekty.Ex1;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.name = "Andrzej Bednarczyk";
        employee1.position = "Owner";
        employee1.yearOfBirth = 1959;
        employee1.seniority = 20;

        System.out.println("Pan " + employee1.name + ", stanowisko: " + employee1.position +
                ", rok urodzenia: " + employee1.yearOfBirth + ", staż pracy: " + employee1.seniority +
                " lat");
    }
}
