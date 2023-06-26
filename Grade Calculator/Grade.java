import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score: ");
        int testScore = scanner.nextInt();
        String grade;
        if (testScore >= 90)
        {
            grade = "A";
        }
        else if (testScore >= 80)
        {
            grade = "B";
        }
        else if (testScore >= 70)
        {
            grade = "C";
        }
        else if (testScore >= 60)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);
    }
}