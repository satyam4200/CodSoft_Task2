import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int noSub = scanner.nextInt();
        int total = 0;
        double avgP;

        for (int i = 1; i <= noSub; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                continue;
            }
                total += marks;
        }

        avgP = (double) total / noSub;

        char grade = calGrade(avgP);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + avgP + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calGrade(double avgP) {
        if (avgP >= 90) {
            return 'A';
        } else if (avgP >= 80) {
            return 'B';
        } else if (avgP >= 70) {
            return 'C';
        } else if (avgP >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}