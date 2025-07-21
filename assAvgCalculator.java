import java.util.Scanner;

public class assAvgCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subject: ");
        int numSubjects = scanner.nextInt();

        int[] scores = new int[numSubjects];
        int i = 0;
        while (i < numSubjects) {
            System.out.print("Enter the score for subject " + (i + 1) + ": ");
            int score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            }
        }
        
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        double averageScore = (double) totalScore / numSubjects;

        System.out.println("Average Score:" + averageScore);

        scanner.close();
    }
}