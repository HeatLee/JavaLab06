package by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.model.logic;


public class DistansCalculator{

    public static double calculateLength(double x1, double y1, double x2, double y2){

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return length;

    }

}
