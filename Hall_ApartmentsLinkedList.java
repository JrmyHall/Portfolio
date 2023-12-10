import java.util.LinkedList;
import java.util.Scanner;

/* Jeramy Hall
   Programming Fundamentals III
   11/20/2023
 */

public class Hall_ApartmentsLinkedList {

    public static void main(String[] args) {
        // Linked List to store apartment
        LinkedList<Hall_Apartment> apartmentsList = new LinkedList<>();
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for Apartment values and add them to the Linked List
        while (true) {
            System.out.println("Enter Apartment details (or enter 'exit' to stop):");

            // User input for Street Address
            System.out.print("Street Address: ");
            String streetAddress = scanner.nextLine();

            // Check if the user wants to exit
            if (streetAddress.equalsIgnoreCase("exit")) {
                break;
            }

            // User input for Apartment Number
            System.out.print("Apartment Number: ");
            int apartmentNumber = scanner.nextInt();
            scanner.nextLine();

            // User input for Monthly Rent
            System.out.print("Monthly Rent: $");
            double monthlyRentAmount = scanner.nextDouble();
            scanner.nextLine();

            // User input for Number of Bedrooms
            System.out.print("Number of Bedrooms: ");
            int numberOfBedrooms = scanner.nextInt();
            scanner.nextLine();

            // Apartment object and add it to the LinkedList
            Hall_Apartment apartment = new Hall_Apartment(streetAddress, apartmentNumber, monthlyRentAmount, numberOfBedrooms);
            apartmentsList.add(apartment);
        }

        // Sort the Apartments by rent value using the compareTo method in Hall_Apartment class
        apartmentsList.sort(Hall_Apartment::compareTo);

        // Display the sorted list of Apartments by rent amount
        System.out.println("\nSorted List of Apartments by rent value:");
        for (Hall_Apartment apartment : apartmentsList) {
            System.out.println(apartment);
        }

        // Scanner close
        scanner.close();
    }
}

