package grademanagementsystem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeManagementSystem 
{
    // Method to display statistics for each student   
    public static void displayStatistics(String[] studentNames, double[] totalScore, double[] averageScores) 
    {
        System.out.println("\nStatistics:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Student: " + studentNames[i]);
            System.out.println("Total Score: " + totalScore[i]);
            System.out.println("Average Score: " + averageScores[i]);
            System.out.println();
        }
    }
  
    // Method to calculate average scores for each student
    public static double[] calculateAverageScore(int[][] marks) {
        double[] averageScores = new double[marks.length];
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            double average = (double) total / marks[i].length;
            averageScores[i] = Double.parseDouble(df.format(average));
        }
        return averageScores;
    }

    // Method to calculate total scores for each student
    public static double[] calculateTotalScore(int[][] marks) {
        double[] totalScores = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            totalScores[i] = total;
        }

        return totalScores;
    }
  
    // Method to get marks for each student
    public static int[][] getStudentMarks(Scanner scanner, int numStudents, int numSubjects, String[] subjects,
            String[] studentNames) {
        int[][] marks = new int[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter marks for student " + (i + 1) + ": ");
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Enter marks for " + subjects[j] + ": ");
                marks[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return marks;
    }
    // Method to get subject names
    public static String[] getSubjectNames(Scanner scanner, int numSubjects) {
        String[] subjects = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }
        return subjects;
    }

    // Method to get the number of subjects
    public static int getNumberOfSubjects(Scanner scanner) {
        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();
        return numSubjects;
    }

    // Method to get the number of students
    public static int getNumberOfStudents(Scanner scanner) {
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        return numStudents;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        int numStudents = 0;
        int numSubjects = 0;
        String[] subjects = null;
        String[] studentNames = null;
        int[][] marks = null;
        double[] totalScore = null;
        double[] averageScores = null;

        // Menu-driven loop
        do {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Input Data");
            System.out.println("2. Calculate Statistics");
            System.out.println("3. Display Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Handle menu choices
            switch (choice) {
                case 1:
                    // Get number of students
                    numStudents = getNumberOfStudents(scanner);
                    // Get number of subjects
                    numSubjects = getNumberOfSubjects(scanner);
                    // Get the subjects
                    subjects = getSubjectNames(scanner, numSubjects);
                    // Initialize student names array
                    studentNames = new String[numStudents];
                    // Get student marks
                    marks = getStudentMarks(scanner, numStudents, numSubjects, subjects, studentNames);
                    break;
                case 2:
                    // Calculate statistics if data is available
                    if (marks != null) {
                        // Calculate statistics
                        totalScore = calculateTotalScore(marks);
                        averageScores = calculateAverageScore(marks);
                    } else {
                        System.out.println("Please input data first.");
                    }
                    break;
                case 3:
                    // Display statistics if data is available
                    if (studentNames != null && totalScore != null && averageScores != null) {
                        // Display statistics
                        displayStatistics(studentNames, totalScore, averageScores);
                    } else {
                        System.out.println("Please input data and calculate statistics first.");
                    }
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
