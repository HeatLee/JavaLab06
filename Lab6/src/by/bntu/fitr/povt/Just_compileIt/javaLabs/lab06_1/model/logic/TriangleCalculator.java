package by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06_1.model.logic;

public class TriangleCalculator {

    public static double calculatePerimeter(double sideLen1, double sideLen2, double sideLen3){

        double perimeter = sideLen1 + sideLen2 + sideLen3;
        return perimeter;
    }

    public static double calculateArea(double sideLen1, double sideLen2, double sideLen3, double perimeter){

        double halfPerimeter = perimeter/2.0;

        double area =
                Math.sqrt(halfPerimeter*(halfPerimeter - sideLen1)*(halfPerimeter -sideLen2)*(halfPerimeter-sideLen3));

        return area;

    }
}
