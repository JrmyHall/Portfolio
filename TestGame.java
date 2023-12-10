/*  Jeramy Hall
    3/2/2023
    Program 3 SLO 2
 */
//Class to display match up between two different teams and what time it takes place.
//Define the class TestGame
public class TestGame {
    //Start execution of the main() method
    public static void main(String[] args) {
        //Create the objects of the class Team by providing the required values to its constructors.
        Team team1 = new Team("Ennis High School", "Girls Basketball", "Lions");
        Team team2 = new Team("Red Oak High School", "Girls Basketball", "Hawks");
        //Create an object of the class Game by passing required values to its constructior
        Game game1 = new Game(team1, team2, "6 PM");
        //Call the function display() by passing the game class object
        display(game1);
    }
//Define the function display() to display the game details
    public static void display(Game g) {
        //Get the team 1 and team 2 by calling the respective getTeam1() and getTeam2() functions.
        Team t1 = g.getTeam1();
        Team t2 = g.getTeam2();
        //Display both team names, sport, and mascot
        System.out.println("The game between " + t1.getName() + " " + t1.getSport() + " " + t1.getMascot());
        System.out.println(" and " + t2.getName() + " " + t2.getSport() + " " + t2.getMascot());
        System.out.println(" takes place at " + g.getTime());
    }
}
