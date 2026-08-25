package dayfour;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        rectangle room1 = new rectangle(20, 10);
        double areaOfRoom1 = room1.calculateArea();

        System.out.println("The area of room 1 is " + areaOfRoom1);

        rectangle room2 = new rectangle(10, 5);
        double areaOfRoom2 = room2.calculateArea();

        System.out.println("The area of room 2 is " + areaOfRoom2);

        System.out.println("The total area is " + (areaOfRoom1 + areaOfRoom2));
    }
}