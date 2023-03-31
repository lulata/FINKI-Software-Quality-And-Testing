import java.util.*;

public class Employee {
    public static void main(String[] args) {
        HashSet<String> firstSet = new HashSet<>();
        HashSet<String> secondSet = new HashSet<>();

        firstSet.add("David");
        firstSet.add("Luka");
        firstSet.add("Mladen");
        firstSet.add("Kiril");

        secondSet.add("Andrej");
        secondSet.add("Naum");
        secondSet.add("Bojan");
        secondSet.add("Kiril");

        System.out.println(notInBothTeams(firstSet,secondSet));
    }

    public static Set<String> notInBothTeams(Set<String> team1, Set<String> team2)   {
        Set<String> result = new HashSet<String>();

        for (String s : team1) {
            if (!team2.contains(s)) {
                result.add(s);
            }
        }

        for (String s : team2) {
            if (!team1.contains(s)) {
                result.add(s);
            }
        }

        return result;
    }
}
