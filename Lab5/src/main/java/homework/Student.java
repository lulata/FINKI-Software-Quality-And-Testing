package homework;

public class Student {

    private String name;
    private String surname;
    private Course course;
    private int age;

    public Student(String name, String surname, Course course, int age) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return this.name == null ? "" : this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname != null ? surname : "";
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getCourse() {
        return course != null ? course : Course.OTHER;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" +this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", course=" + this.getCourse() +
                ", age=" + this.getAge()+
                '}';
    }
}