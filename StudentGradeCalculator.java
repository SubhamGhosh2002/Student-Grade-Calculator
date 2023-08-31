import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        float totalScore = 0;
        float totalMaxMarks = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for subject " + i + ": ");
            float subjectScore = scanner.nextFloat();
            
            System.out.print("Enter the maximum marks for subject " + i + ": ");
            float maxMarks = scanner.nextFloat();
            
            totalScore += subjectScore;
            totalMaxMarks += maxMarks;
        }
        
        float averageScore = totalScore / numSubjects;
        float averagePercentage = (totalScore / totalMaxMarks) * 100;
        
        System.out.println("Average score: " + formatDecimal(averageScore));
        System.out.println("Average percentage: " + formatDecimal(averagePercentage) + "%");
        System.out.println("Letter grade: " + calculateGrade(averagePercentage));
        
        scanner.close();
    }
    
    public static String formatDecimal(float value) {
        return String.format("%.2f", value);
    }
    
    public static String calculateGrade(float averagePercentage) {
        if (averagePercentage >= 90) {
            return "O - Outstanding";
        } else if (averagePercentage >= 80) {
            return "E - Excellent";
        } else if (averagePercentage >= 70) {
            return "A - Very good";
        } else if (averagePercentage >= 60) {
            return "B - Good";
        } else if (averagePercentage >= 50) {
            return "C - Fair";
        } else if (averagePercentage >= 40) {
            return "D - Below average";
        } else {
            return "F - Failed";
        }
    }
}
