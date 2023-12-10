//Import scanner and arrays libraries
import java.util.Scanner;
import java.util.Arrays;

/*Jeramy Hall
 Program 5
 4/2/2023
 */

//Create a GradeAverage class
public class GradeAverage {
    //Create a main method
    public static void main(String[] args) {
        //Create a scanner for user input
        Scanner input = new Scanner(System.in);
        //Set the number of grades to be entered
        final int GRADE_COUNT = 15;
        //Create an array to store the grades
        int[] grades = new int[GRADE_COUNT];
        //Set a counter for the number of grades entered and the sum of the grades entered
        int counter = 0;
        double sum = 0;
        //Use a while loop to prompt the user to enter grades until the number of grades specified has been entered
        while (counter < GRADE_COUNT) {
            //Prompt the user to enter a grade
            System.out.print("Enter grade #" + (counter + 1) + ": ");
            int grade = input.nextInt();
            //If the grade is not between 0 and 100 inclusive, print an error message
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade entered. Please enter a grade between 0 and 100.");
            } else {
                //If the grade is valid, store in the array, add it to the sum, and increment the counter
                grades[counter] = grade;
                sum += grade;
                counter++;
            }
        }
        //Calculate the average of the grades entered
        double average = sum / GRADE_COUNT;
        //Print the list of grades entered
        System.out.println("\nGrade List:");
        for (int i = 0; i < GRADE_COUNT; i++) {
            System.out.println("Grade #" + (i + 1) + ": " + grades[i]);
        }
        //Print the list of grades below 70
        System.out.println("\nGrades Below 70:");
        for (int i = 0; i < GRADE_COUNT; i++) {
            if (grades[i] < 70) {
                System.out.println("Grade #" + (i + 1) + ": " + grades[i]);
            }
        }
        //Sort the array of grades in ascending order
        Arrays.sort(grades);
        //Print the maximum, minimum, and average grades
        System.out.println("\nMaximum Grade: " + grades[GRADE_COUNT - 1]);
        System.out.println("Minimum Grade: " + grades[0]);
        System.out.println("Average Grade: " + Math.round(average));
        //Prompt the user to enter another set of grades or end the program
        System.out.print("\nDo you want to average another set of grades? (Y/N): ");
        String choice = input.next();
        if (choice.equalsIgnoreCase("Y")) {
            //If the user inputs "Y", run the main method again to repeat the program
            main(new String[0]);
        } else {
            //If the user inputs "N", end the program
            return;
        }
    }
}