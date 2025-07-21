import java.util.Scanner;
public class averageScoreCalculator2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of subjects: ");
    int numSubjects = scanner.nextInt();
	{
	System.out.print("Enter score for Math: ");
    int mathScore = scanner.nextInt();

    System.out.print("Enter score for Science: ");
    int scienceScore = scanner.nextInt();

    System.out.print("Enter score for English: ");
    int englishScore = scanner.nextInt();

    // Validate scores
    if (mathScore < 0 || mathScore > 100 || scienceScore < 0 || scienceScore > 100 || englishScore < 0 || englishScore > 100) {
      System.out.println("Invalid score. Please enter scores between 0 and 100.");
    } else {
      int totalScore = mathScore + scienceScore + englishScore;
      double averageScore = (double) totalScore / 3;
      System.out.println("Average score: " + averageScore);
    }

    scanner.close();
  }
}

}