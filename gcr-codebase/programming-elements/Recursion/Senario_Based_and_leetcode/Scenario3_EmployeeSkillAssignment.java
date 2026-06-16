
import java.util.*;

public class Scenario3_EmployeeSkillAssignment {

    static void findTeams(int[] skills, int index, int target,
                          List<Integer> current, int sum) {

        if (sum == target) {
            System.out.println(current);
            return;
        }

        if (index == skills.length || sum > target) return;

        current.add(skills[index]);
        findTeams(skills, index + 1, target, current, sum + skills[index]);

        current.remove(current.size() - 1);
        findTeams(skills, index + 1, target, current, sum);
    }

    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target, new ArrayList<>(), 0);
    }
}
