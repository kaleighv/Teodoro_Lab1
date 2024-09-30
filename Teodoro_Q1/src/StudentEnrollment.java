import java.util.Scanner;

public class StudentEnrollment {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Get student information
        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = input.nextLine();

        int numberOfUnits;
        do {
            System.out.print("Enter Number of Units (Maximum 10): ");
            numberOfUnits = input.nextInt();

            if (numberOfUnits > 10) {
                System.out.println("Error: Maximum number of units allowed is 10.");
            }
        } while (numberOfUnits > 10);

        // Calculate enrollment fee
        int feePerUnit = 1000;
        int totalEnrollmentFee = numberOfUnits * feePerUnit;

        // Display enrollment details
        System.out.println("\n--- Enrollment Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalEnrollmentFee);

        // Process payment
        System.out.print("\nEnter Payment Amount: ");
        int paymentAmount = input.nextInt();

        if (paymentAmount == totalEnrollmentFee) {
            System.out.println("Fully Paid");
        } else if (paymentAmount < totalEnrollmentFee) {
            int remainingBalance = totalEnrollmentFee - paymentAmount;
            System.out.println("Partial Payment");
            System.out.println("Amount Paid: " + paymentAmount);
            System.out.println("Remaining Balance: " + remainingBalance);
        } else {
            System.out.println("Error: Payment exceeds total fee.");
        }

        // Close the Scanner object
        input.close();
    }
}