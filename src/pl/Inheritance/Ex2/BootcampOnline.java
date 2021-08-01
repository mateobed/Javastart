package pl.Inheritance.Ex2;

public class BootcampOnline extends OnlineCourse{
    private String teacher;
    private int consultationHours;

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }
}
