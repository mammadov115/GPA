package Projects;

import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math, physics, history;
        System.out.println("Math grade:");
        math = input.nextInt();

        System.out.println("Physics grade:");
        physics = input.nextInt();

        System.out.println("History grade:");
        history = input.nextInt();

        double gpa = (math + physics + history) / 3;

        String status = gpa >= 60 ? "You Passed" : "You Failed";

        System.out.println("Your GPA: " + gpa);
        System.out.println(status);



    }
}
