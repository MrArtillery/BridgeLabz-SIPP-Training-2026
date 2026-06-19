public class EmployeeSkillAssignment {

    static void findTeams(int[] skills, int target,
                          int index, String team, int currentSum) {

        // Target achieved
        if (currentSum == target) {
            System.out.println("[" + team.substring(0, team.length() - 1) + "]");
            return;
        }

        // Base Case
        if (index == skills.length || currentSum > target) {
            return;
        }

        // Include current employee
        findTeams(skills,
                  target,
                  index + 1,
                  team + skills[index] + ",",
                  currentSum + skills[index]);

        // Exclude current employee
        findTeams(skills,
                  target,
                  index + 1,
                  team,
                  currentSum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        System.out.println("Possible Teams:");

        findTeams(skills, target, 0, "", 0);
    }
}
