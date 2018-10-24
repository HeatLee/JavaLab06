package by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.controller;

import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.model.logic.DistansCalculator;
import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.utlil.UserInput;
import by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.view.Printer;

public class Lab06 {

    public static void main(String[] args) {

        Printer.print("Input coordinates of first point: ");
        double x1 = UserInput.input("x1 = ");
        double y1 =  UserInput.input("y1 = ");

        Printer.print("Input coordinates of second point:");
        double x2 = UserInput.input("x2 = ");
        double y2 = UserInput.input("y2 = ");

        double rezult = DistansCalculator.calculateLength(x1, y1, x2, y2);
        Printer.print("Rezult = " + rezult);

    }

}
