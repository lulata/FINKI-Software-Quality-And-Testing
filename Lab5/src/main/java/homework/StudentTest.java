package homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StudentTest {

    @Test
    public void testGetName_NullName() {
        // Create a student object with null name
        Student student = new Student(null, "Doe", Course.OS, 20);
        assertEquals("", student.getName());
    }

    @Test
    public void testGetCourse_NullCourse() {
        Student student = new Student("John", "Doe", null, 20);
        assertEquals(Course.OTHER, student.getCourse());
    }

    @Test
    public void testSetAge_NegativeAge() {
        Student student = new Student("John", "Doe", Course.OS, 20);
        student.setAge(-5);
        assertEquals(0, student.getAge(), 0.01);
    }

    @Test
    public void testToString() {
        // Create a student object
        Student student = new Student("John", "Doe", Course.OS, 20);
        String expected = "Student{name='John', surname='Doe', course=OS, age=20}";
        assertEquals(expected, student.toString());
    }
}