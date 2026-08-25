package dayfour;

import java.util.Scanner;

public class InstapayCheck {

    static double requiredSalary = 20000;
    static double requiredCreditPoints = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        double creditScore = getCreditScore();

        boolean qualified = isQualified(salary, creditScore);

        notifyUser(qualified);

        scanner.close();
    }

    static double getSalary() {

        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();

        return salary;
    }

    static double getCreditScore() {

        System.out.println("Enter your Credit Score: ");
        double creditScore = scanner.nextDouble();

        return creditScore;
    }

    static boolean isQualified(double sal, double score) {

        if (sal >= requiredSalary && score >= requiredCreditPoints)
            return true;
        else
            return false;
    }

    static void notifyUser(boolean qualified) {

        if (qualified)
            System.out.println("Congrats, you are qualified");
        else
            System.out.println("Sorry, you are not qualified");
    }
}