/* Jeramy Hall
   Programming Fundamentals III
   11/20/2023
 */
public class Hall_Apartment implements Comparable<Hall_Apartment> {

    // Variables
    private String streetAddress;
    private int apartmentNumber;
    private double monthlyRentAmount;
    private int numberOfBedrooms;

    // Initialize Apartment object
    public Hall_Apartment(String streetAddress, int apartmentNumber, double monthlyRentAmount, int numberOfBedrooms) {
        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRentAmount = monthlyRentAmount;
        this.numberOfBedrooms = numberOfBedrooms;
    }



    // toString to represent Apartment details as a String
    @Override
    public String toString() {
        return "Apartment " + apartmentNumber + " at " + streetAddress +
                " - " + numberOfBedrooms + " bedrooms, Rent: $" + monthlyRentAmount;
    }

    // compareTo to compare Apartment based on rent value
    @Override
    public int compareTo(Hall_Apartment otherApartment) {
        // Using Double.compare handles floating point comparison
        return Double.compare(this.monthlyRentAmount, otherApartment.monthlyRentAmount);
    }
}

