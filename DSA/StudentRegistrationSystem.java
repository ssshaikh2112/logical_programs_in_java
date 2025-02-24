package arrays;

import java.util.Scanner;

public class StudentRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        String[] names = new String[numberOfStudents];
        int[] enrollmentNumbers = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            names[i] = scanner.nextLine();
            enrollmentNumbers[i] = i + 1; // Assigning enrollment numbers sequentially
            System.out.print(enrollmentNumbers[i] + ": " + names[i]);
            System.out.println();
        }
    }
}