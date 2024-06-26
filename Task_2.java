// Task_2(Student Grade Calculator)--->>>

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************Welcome to all in my Student Garde Calculator*****************");

        // Enter total number of subjects to calculate their marks
        System.out.print("\nEnter total number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("\nEnter marks for subject" + i + " (out of 100): ");
            int marks = sc.nextInt();

            // INPUT VALIDATION
            while (marks < 0 || marks > 100) {
                System.out.println("Invalids marks!! Please enter marks between 0 to 100.");
                System.out.print("\nEnter marks for subject: " + i + "Out of 100");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("\nStudent Result:- ");
        System.out.print("\nTotal marks Obtain in all subjects: " + totalMarks);

        // Calculate Average Parcentage: Divide the totalMarks by the totalNumber of sujects to get average percentage.

        int AveragePercentage = totalMarks / numSubjects;

        System.out.print("\n\nAverage Percentage: " + AveragePercentage);
     
        
    }

}
