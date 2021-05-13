package pl.StaticComponents.Ex1;

public class University {
    public static void main(String[] args) {
        System.out.println("Lkiczba studentów przed zapisami: " + Student.getStudentsNumber());
        Student student1 = new Student("Jan", "Kowalski", 12345);
        Student student2 = new Student("Kinga", "Bednarczyk", 67890);
        Student student3 = new Student("Sebastian", "Nowak", 13579);
        System.out.println("Liczba studentów po zapisach: " + Student.getStudentsNumber());

    }
}
