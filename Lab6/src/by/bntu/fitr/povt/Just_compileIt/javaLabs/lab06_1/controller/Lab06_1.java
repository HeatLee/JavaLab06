package by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06_1.controller;

import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.utlil.UserInput;
import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.view.Printer;
import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06_1.model.logic.TriangleCalculator;
import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.model.logic.DistansCalculator;

public class Lab06_1 {
    public static void main(String[] args) {

        Printer.print("Input triangle tops: ");

        double x1 = UserInput.input("x1 = ");
        double y1 = UserInput.input("y1 = ");

        double x2 = UserInput.input("x2 = ");
        double y2 = UserInput.input("y2 = ");

        double x3 = UserInput.input("x3 = ");
        double y3 = UserInput.input("y3 = ");

        double side1 = DistansCalculator.calculateLength(x1, y1, x2, y2);
        double side2 = DistansCalculator.calculateLength(x2, y2, x3, y3);
        double side3 = DistansCalculator.calculateLength(x1, y1, x3, y3);

        double perimeter = TriangleCalculator.calculatePerimeter(side1, side2, side3);

        double area = TriangleCalculator.calculateArea(side1, side2, side3, perimeter);

        Printer.print("Perimeter = " + perimeter);
        Printer.print("Area = " + area);
    }
}
