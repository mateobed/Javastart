package pl.Object_hashCode;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Nowak", 30);
        Student student2 = new Student("Nowak", 30);
        Student student3 = new Student("Zawadzka", 33);

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

    }
}
