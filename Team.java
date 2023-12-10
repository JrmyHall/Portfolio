/*  Jeramy Hall
    3/2/2023
    Program 3 SLO 2
 */
//Define the class Team
public class Team {
    //Declare variables of type string.
    private String name;
    private String sport;
    private String mascot;
    //Declare and initialize a final static variable MOTTO.
    public final static String MOTTO = "Sportsmanship!";

//Declare the parameter constructor.
    public Team(String name, String sport, String mascot) {
        super();
        //Initialize variables.
        this.name = name;
        this.sport = sport;
        this.mascot = mascot;
    }
    //Define get methods for each variable.
    public String getName() {
        return name;
    }
    public String getSport() {
        return sport;
    }
    public String getMascot() {
        return mascot;
    }


}