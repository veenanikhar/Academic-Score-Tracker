# Grade Management System

## Introduction

The Grade Management System is a simple Java application designed to manage and calculate the grades of students across multiple subjects. This application allows users to input student names and their respective marks for different subjects, calculate total and average scores, and display the statistics.

## Features

- **Menu-driven Interface:** Users can navigate through a menu to input data, calculate statistics, and display statistics.
- **Input Data:** Enter the number of students and subjects, along with student names and their marks for each subject.
- **Calculate Statistics:** Compute total and average scores for each student.
- **Display Statistics:** Display the total and average scores for each student.

## Usage

1. **Clone the Repository:**
git clone https://github.com/yourusername/GradeManagementSystem.git
cd GradeManagementSystem

2. **Compile the Java Program:**
javac grademanagementsystem/GradeManagementSystem.java

3. **Run the Program:**
java grademanagementsystem.GradeManagementSystem

4. **Follow the Menu Prompts:**
- Choose "1" to input data.
- Choose "2" to calculate statistics.
- Choose "3" to display statistics.
- Choose "4" to exit the program.

## Code Overview

The main components of the application are as follows:

### Methods

- **displayStatistics:** Displays the total and average scores for each student.
- **calculateAverageScore:** Calculates the average score for each student.
- **calculateTotalScore:** Calculates the total score for each student.
- **getStudentMarks:** Inputs the marks for each student for all subjects.
- **getSubjectNames:** Inputs the names of the subjects.
- **getNumberOfSubjects:** Inputs the number of subjects.
- **getNumberOfStudents:** Inputs the number of students.

### Main Method

- Contains the main menu loop that allows the user to choose different actions.
- Calls the relevant methods based on user input to manage and display student grade data.

## Example Usage

Enter your choice: 1
Enter the number of students: 2
Enter the number of subjects: 3
Enter the name of subject 1: Math
Enter the name of subject 2: Science
Enter the name of subject 3: History

Enter the name of student 1: Alice
Enter marks for Math: 85
Enter marks for Science: 90
Enter marks for History: 78

Enter the name of student 2: Bob
Enter marks for Math: 75
Enter marks for Science: 80
Enter marks for History: 88

Enter your choice: 2
Statistics calculated.

Enter your choice: 3
Statistics:
Student: Alice
Total Score: 253.0
Average Score: 84.33

Student: Bob
Total Score: 243.0
Average Score: 81.0

Enter your choice: 4
Exiting the program.

## Dependencies

- Java Development Kit (JDK) 8 or higher.
