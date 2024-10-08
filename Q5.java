
// 05 05 05 05 05 05 05 05

import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }


    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class CircleRegionArea {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Enter the radius of the outer circle (ro): ");
        double ro = scanner4.nextDouble();

        System.out.println("Enter the radius of the inner circle (ri): ");
        double ri = scanner4.nextDouble();

        if (ro <= ri) {
            System.out.println("Error: Inner radius is larger than outer radius.");
        } else {
            Circle outerCircle = new Circle(ro);
            Circle innerCircle = new Circle(ri);

            double outerArea = outerCircle.computeArea();
            double innerArea = innerCircle.computeArea();
            double outerCircumference = outerCircle.computeCircumference();
            double innerCircumference = innerCircle.computeCircumference();

            double needArea = outerArea - innerArea;

            System.out.println("The area of the shaded area is:" + needArea);
            System.out.println("Outer circle circumference: " + outerCircumference);
            System.out.println("Inner circle circumference: " + innerCircumference);
            scanner4.close();
        }
    }
}
