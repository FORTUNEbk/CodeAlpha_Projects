import java.util.ArrayList;
import java.util.Scanner;

public class CodeAlpha_StudentTrucker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("=== Student Grade Tracker ===");
        
        while (true) {
            System.out.print("Enter a grade (or -1 to finish): ");
            int grade = scanner.nextInt();
            if (grade == -1) break;
            grades.add(grade);
        }
        
        if (grades.isEmpty()) {
            System.out.println("No grades entered!");
            return;
        }
        

        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);
        
        for (int grade : grades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }
        
        double average = (double) sum / grades.size();
        
        System.out.println("\n--- Grade Summary Report ---");
        System.out.println("Grades entered: " + grades);
        System.out.println("Number of students: " + grades.size());
        System.out.println("Average score is: " + average);
        System.out.println("Highest score is: " + highest);
        System.out.println("Lowest score is: " + lowest);
    }
}
