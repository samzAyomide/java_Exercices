import java.util.Scanner;
public class averageScoreCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of subjects: ");
    int numSubjects = scanner.nextInt();

    int totalScore = 0;
    for (int i = 1; i <= numSubjects; i++) {
      System.out.print("Enter score for subject " + i + ": ");
      int score = scanner.nextInt();

      // Validate score
      if (score < 0 || score > 100) {
        System.out.println("Invalid score. Please enter a score between 0 and 100.");
        i--; // Decrement i to re-enter the score for the current subject
        continue;
      }

      totalScore += score;
    }

    double averageScore = (double) totalScore / numSubjects;
    System.out.println("Average score: " + averageScore);

    scanner.close();
	
}

}