package pl.Object_equals;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 25);
        Student student2 = new Student("Jan Kowalski", 25);
        System.out.println("student1 == student2");
        System.out.println(student1 == student2); // do porównywania obiektów nie wykorzystujemy ==
        System.out.println("student.equals(student2)");
        boolean studentEquals = student1.equals(student2);
        System.out.println(studentEquals);


    }
}
