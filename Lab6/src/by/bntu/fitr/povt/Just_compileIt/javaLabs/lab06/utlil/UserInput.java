package by.bntu.fitr.povt.Just_compileIt.javaLabs.lab06.utlil;

import java.util.Scanner;

public class UserInput {

    public static double input(String msg){

        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);
        double value = scanner.nextDouble();
        return value;

    }
}
