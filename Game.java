/*  Jeramy Hall
    3/2/2023
    Program 3 SLO 2
 */
//Define the class game
public class Game {
    //Declare the required objects of the class team.
    private Team team1;
    private Team team2;
    //Declare the required private member variable of the string type time.
    private String time;
//Define the parameter constructor of the class Game
    public Game(Team team1, Team team2, String time) {
        //Initialize the Team class objects with the parameters team1 and team2
        super();
        this.team1 = team1;
        this.team2 = team2;
        //Initialize the string time with the parameter given.
        this.time = time;
    }
//Define get methods for each member variables
    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getTime() {
        return time;
    }

}