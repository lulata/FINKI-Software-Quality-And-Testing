package homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ConferenceTest {

    private Conference conference;

    @Before
    public void setUp() {
        conference = new Conference(3);
        conference.addAttendeeToConference(new Student("John", "Doe", Course.EMT, 20));
        conference.addAttendeeToConference(new Student("Jane", "Smith", Course.WEB, 22));
        conference.addAttendeeToConference(new Student("Alice", "Johnson", Course.OS, 19));
    }

    @Test
    public void testPrice(){
        assertEquals(23.98,conference.calculateTotalPricePaid(),0.01);
    }
    @Test
    public void testCapacityDynamic() {
       List<Student> attendees =  new ArrayList<>();
       for (int i = 0; i < 11000; i++) {
           Student student = new Student("John", "Doe", Course.OTHER, 20);
           attendees.add(student);
       }
        conference = new Conference(1);
       for (Student student : attendees) {
           conference.addAttendeeToConference(student);
       }
         assertEquals(71514.90000000298, conference.calculateTotalPricePaid(),0.1);
    }

    @Test
    public void testUser(){
        assertEquals("John", conference.getAttendees().get(0).getName());
    }

    @Test
    public void testCapacity(){
        assertEquals(3, conference.getCapacity());
    }


}