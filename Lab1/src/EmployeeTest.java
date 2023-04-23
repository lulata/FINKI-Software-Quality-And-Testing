import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Set<String> firstSet;
    private Set<String> secondSet;

    @BeforeEach
    public void setUp() {
        firstSet = new HashSet<>();
        secondSet = new HashSet<>();

        firstSet.add("David");
        firstSet.add("Luka");
        firstSet.add("Mladen");
        firstSet.add("Kiril");
        firstSet.add("Erika");

        secondSet.add("David");
        secondSet.add("Naum");
        secondSet.add("Mladen");
        secondSet.add("Kiril");
        secondSet.add("Tamara");
    }

    // C1 - Team 1 is empty
    @Test
    public void firstSetEmpty() {
        assertTrue(firstSet.isEmpty());
    }

    // C2 - Team 2 is empty
    @Test
    public void secondSetEmpty() {
        assertTrue(secondSet.isEmpty());
    }

    // C3 - Both teams share at least one element
    @Test
    public void sameId() {
        Set<String> expected = new HashSet<>();
        expected.add("Luka");
        expected.add("Erika");
        expected.add("Naum");
        expected.add("Tamara");


        int sharedLength = Employee.notInBothTeams(firstSet, secondSet).size();
        System.out.println(sharedLength);
        assertEquals(expected.size(), sharedLength);
    }

    @Test
    public void TTF() {
        firstSet.clear();
        secondSet.clear();

        if (firstSet.isEmpty() && secondSet.isEmpty()) {
            System.out.println("Both teams are empty");
        }
    }

    @Test
    public void TFF() {
        firstSet.clear();

        if (firstSet.isEmpty() && !secondSet.isEmpty()) {
            System.out.println("First teams is empty");
        }

    }

    @Test
    public void FTF() {
        secondSet.clear();

        if (!firstSet.isEmpty() && secondSet.isEmpty()) {
            System.out.println("Second teams is empty");
        }

    }
}
