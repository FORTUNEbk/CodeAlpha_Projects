import java.util.ArrayList;
import java.util.Scanner;

public class gradeTrucker {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("student grades trucker");
        while(true){
            System.out.println("Enter students grade(or -1 to finish)");
            int grade = scanner.nextInt();
            if(grade == -1) break;
            grades.add(grade);
        }

        if(grades.isEmpty()){
            System.out.println("No grades entered");
            return;
        }

        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for(int grade:grades){
            sum +=grade;
            if(grade > highest) grade = highest;
            if(grade < lowest) grade = lowest;

        }

        double average = ((double)sum/grades.size());

        System.out.println("Here is the grade summary report");
        System.out.println("The grades entered: " + grades);
        System.out.println("The number of students entered is: " + grades.size());
        System.out.println("THe average score is: " + average);
        System.out.println("The highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);
    }
    
}
