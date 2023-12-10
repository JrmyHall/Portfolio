/*  Jeramy Hall
    3/2/2023
    Program 3 SLO 2
 */
// Class to Display Three different team names, sports, and mascot.
public class TestTeam {
    public static void main(String[] args) {
        Team team1 = new Team("Red Oak High School", "Girls Basketball", "Hawks");
        Team team2 = new Team("Ennis High School", "Boys Football", "Lions");
        Team team3 = new Team("Palmer High School", "Boys Baseball", "BullDogs");
        display(team1);
        display(team2);
        display(team3);
    }
//Print each team and their information
    public static void display(Team t) {
        System.out.println(t.getName() + " " + t.getSport() + " team " + t.getMascot() + "\n Our motto is " + t.MOTTO);
    }
}