package dayfour;

public class rectangle {

    double length;
    double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return (length * 2) + (width * 2);
    }
}