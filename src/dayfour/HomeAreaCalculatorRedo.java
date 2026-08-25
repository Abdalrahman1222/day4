package dayfour;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo homeRedo = new HomeAreaCalculatorRedo();

        rectangle kitchen = homeRedo.getRoomDimensions();
        rectangle bathRoom = homeRedo.getRoomDimensions();

        homeRedo.scanner.close();

        double totalArea = homeRedo.calculateTotalArea(kitchen, bathRoom);

        System.out.println("Total area is: " + totalArea);
    }

    public rectangle getRoomDimensions() {

        System.out.println("Enter room length");
        double length = scanner.nextDouble();

        System.out.println("Enter room width");
        double width = scanner.nextDouble();

            rectangle rectangle = new rectangle(length, width);

        return rectangle;
    }

    double calculateTotalArea(rectangle rectangle1, rectangle rectangle2) {

        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}